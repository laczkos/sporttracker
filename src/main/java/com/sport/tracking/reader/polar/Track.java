package com.sport.tracking.reader.polar;

import java.util.List;

public class Track {

    private List<MeasureMent> measureMents;

    public Track(List<MeasureMent> measureMents) {
        this.measureMents = measureMents;
    }

    public List<MeasureMent> getMeasureMents() {
        return measureMents;
    }

    @Override
    public String toString() {
        return "Track{" +
                "measureMents=" + measureMents +
                '}';
    }
}
