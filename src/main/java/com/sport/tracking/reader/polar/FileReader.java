package com.sport.tracking.reader.polar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileReader {

    private static final Logger LOGGER = Logger.getLogger(FileReader.class.getName());

    private static final String LINE_ENDING = "\r\n";
    private static final String VALUE_SEPARATOR = "\t";

    public Track read(String path) {
        Scanner scanner = createScanner(path);
        scanner.useDelimiter(LINE_ENDING);
        ArrayList<MeasureMent> measureMents = new ArrayList<MeasureMent>();
        while (scanner.hasNext()) {
            String[] values = scanner.next().split(VALUE_SEPARATOR);
            if (values.length >= 3) {
                measureMents.add(new MeasureMent(values[0], values[1], values[3]));
            } else {
                LOGGER.info("Unable to parse line:" + Arrays.toString(values));
            }
        }
        return new Track(measureMents);
    }

    private Scanner createScanner(String path) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            LOGGER.warning("Couldn't read file:" + path);
            scanner = new Scanner("");
        }
        return scanner;
    }
}
