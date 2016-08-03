package com.sport.tracking.reader.gps;

public class MeasureMent {

    private Coordinate coordinate;
    private String elevation;
    private String timeStamp;

    public MeasureMent(Coordinate coordinate, String elevation, String timeStamp) {
        this.coordinate = coordinate;
        this.elevation = elevation;
        this.timeStamp = timeStamp;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getElevation() {
        return elevation;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "MeasureMent{" +
                "coordinate=" + coordinate +
                ", elevation='" + elevation + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
