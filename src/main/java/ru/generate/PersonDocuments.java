package ru.generate;

import ru.documents.entity.Document;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Класс со всеми созданными документами
 *
 * @author BespoyasovaV
 */
public class PersonDocuments {
    /**
     * Здесь хранятся все созданные документы
     */
    public static Map<String, List<Document>> personDocuments = new TreeMap<>();
}