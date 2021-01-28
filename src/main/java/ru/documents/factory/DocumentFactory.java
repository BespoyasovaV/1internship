package ru.documents.factory;

import ru.documents.*;
import ru.generate.RandomValue;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * класс самый бесполезный теперь
 */
public class DocumentFactory extends RandomValue {
    public HashMap<String, ArrayList<Document>> person_and_document = new HashMap<String, ArrayList<Document>>();
}

