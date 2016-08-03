package com.sport.tracking.reader.gps;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    private static final String TRACK_SEGMENT_ROOT = "trkseg";
    private static final String LATITUDE = "lat";

    public Track read(String path) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = createDocumentBuilder(documentBuilderFactory);
        Document document = readDocument(path, documentBuilder);
        NodeList trackSegments = document.getElementsByTagName(TRACK_SEGMENT_ROOT);
        return new Track(new ArrayList<MeasureMent>());
    }

    private Document readDocument(String path, DocumentBuilder documentBuilder) {
        Document document = null;
        try {
            document = documentBuilder.parse(new File(path));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    private DocumentBuilder createDocumentBuilder(DocumentBuilderFactory documentBuilderFactory) {
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return documentBuilder;
    }
}
