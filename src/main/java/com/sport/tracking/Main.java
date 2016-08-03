package com.sport.tracking;

import com.sport.tracking.reader.gps.Reader;
import com.sport.tracking.reader.gps.Track;

import java.util.logging.Logger;

/**
 * Entry class of application.
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Reader fileReader = new Reader();
        Track track = fileReader.read(args[0]);

        LOGGER.info(track.toString());
    }
}
