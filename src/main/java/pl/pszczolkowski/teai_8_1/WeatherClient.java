package pl.pszczolkowski.teai_8_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.pszczolkowski.teai_8_1.entities.Weather;
import pl.pszczolkowski.teai_8_1.entities.WeatherBuilder;
import pl.pszczolkowski.teai_8_1.model.ConsolidatedWeather;
import pl.pszczolkowski.teai_8_1.model.Example;

@RestController
public class WeatherClient {

    private WeatherRepo weatherRepo;
    String urlWarsaw = "https://www.metaweather.com/api/location/523920";
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public WeatherClient(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @Scheduled(fixedDelay = 3600000)
    public void getWeather(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<Example> response = restTemplate.exchange(
                urlWarsaw,
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Example.class
        );

        Example example = response.getBody();
        ConsolidatedWeather consolidatedWeather = example.getConsolidatedWeather().get(1);
        Weather weather = new WeatherBuilder()
                .setTitle(example.getTitle())
                .setTime(example.getTime())
                .setWeatherStateName(consolidatedWeather.getWeatherStateName())
                .setMinTemp(consolidatedWeather.getMinTemp().toString())
                .setMaxTemp(consolidatedWeather.getMaxTemp().toString())
                .setTheTemp(consolidatedWeather.getTheTemp().toString())
                .setWindSpeed(consolidatedWeather.getWindSpeed().toString())
                .setAirPressure(consolidatedWeather.getAirPressure().toString())
                .setPredictability(consolidatedWeather.getPredictability())
                .createWeather();

        weatherRepo.save(weather);

        System.out.println("Saved!");
    }
}
