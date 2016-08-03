package com.sport.tracking.reader.polar;

public class MeasureMent {

    private String heartRate;
    private String speed;
    private String altitude;

    public MeasureMent(String heartRate, String speed, String altitude) {
        this.heartRate = heartRate;
        this.speed = speed;
        this.altitude = altitude;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getSpeed() {
        return speed;
    }

    public String getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "MeasureMent{" +
                "heartRate='" + heartRate + '\'' +
                ", speed='" + speed + '\'' +
                ", altitude='" + altitude + '\'' +
                '}';
    }
}
