package pl.pszczolkowski.teai_8_1.entities;

import javax.persistence.*;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String time;
    String weatherStateName;
    String minTemp;
    String maxTemp;
    String theTemp;
    String windSpeed;
    String airPressure;
    long predictability;

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", weatherStateName='" + weatherStateName + '\'' +
                ", minTemp='" + minTemp + '\'' +
                ", maxTemp='" + maxTemp + '\'' +
                ", theTemp='" + theTemp + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", airPressure='" + airPressure + '\'' +
                ", predictability=" + predictability +
                '}';
    }

    public Weather() { }

    public Weather(long id, String title, String time, String weatherStateName, String minTemp, String maxTemp, String theTemp, String windSpeed, String airPressure, long predictability) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.weatherStateName = weatherStateName;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.theTemp = theTemp;
        this.windSpeed = windSpeed;
        this.airPressure = airPressure;
        this.predictability = predictability;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(String theTemp) {
        this.theTemp = theTemp;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(String airPressure) {
        this.airPressure = airPressure;
    }

    public long getPredictability() {
        return predictability;
    }

    public void setPredictability(long predictability) {
        this.predictability = predictability;
    }
}
