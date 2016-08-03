package com.sport.tracking.reader.gps;

import java.util.List;

public class Track {

    private List<MeasureMent> measureMents;

    public Track(List<MeasureMent> measureMents) {
        this.measureMents = measureMents;
    }

    public List<MeasureMent> getMeasureMents() {
        return measureMents;
    }
}
