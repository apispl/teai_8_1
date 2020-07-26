package pl.pszczolkowski.teai_8_1.entities;

public class WeatherBuilder {
    private long id;
    private String title;
    private String time;
    private String weatherStateName;
    private String minTemp;
    private String maxTemp;
    private String theTemp;
    private String windSpeed;
    private String airPressure;
    private long predictability;

    public WeatherBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public WeatherBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public WeatherBuilder setTime(String time) {
        this.time = time;
        return this;
    }

    public WeatherBuilder setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
        return this;
    }

    public WeatherBuilder setMinTemp(String minTemp) {
        this.minTemp = minTemp;
        return this;
    }

    public WeatherBuilder setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
        return this;
    }

    public WeatherBuilder setTheTemp(String theTemp) {
        this.theTemp = theTemp;
        return this;
    }

    public WeatherBuilder setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public WeatherBuilder setAirPressure(String airPressure) {
        this.airPressure = airPressure;
        return this;
    }

    public WeatherBuilder setPredictability(long predictability) {
        this.predictability = predictability;
        return this;
    }

    public Weather createWeather() {
        return new Weather(id, title, time, weatherStateName, minTemp, maxTemp, theTemp, windSpeed, airPressure, predictability);
    }
}
