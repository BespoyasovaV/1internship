package ru.generate;

import ru.documents.entity.Document;
import ru.generate.ProgramCollections;

import java.text.MessageFormat;
import java.util.ArrayList;

/**
 * Класс для обработки(сортировки и вывода0 документов)
 *
 * @author BespoyasovaV
 */
public class ProcessingDocuments {
    /**
     * метод заносит документы из listDocument в мапу и сортирует по авторам
     */
    public static void populate() {
        for (int i = 0; i < ProgramCollections.listFio.size(); i++) {
            ArrayList<Document> docList = ProgramCollections.personDocuments.get(ProgramCollections.listFio.get(i));
            if (docList == null) {
                docList = new ArrayList<>();
            }
            for (Document document : ProgramCollections.Documents) {
                if (document.getAuthor() == ProgramCollections.listFio.get(i)) {
                    docList.add(document);
                    ProgramCollections.personDocuments.put(ProgramCollections.listFio.get(i), docList);
                }
            }
        }
    }

    /**
     * отображает отсортированных по алфавиту авторов и их документы
     */
    public static void conclusion() {
        for (String key : ProgramCollections.personDocuments.keySet()) {
            String text = MessageFormat.format("{0}", key);
            System.out.println(text);
            for (int i = 0; i < ProgramCollections.personDocuments.get(key).size(); i++) {
                String textTwo = MessageFormat.format("      {0}",
                        ProgramCollections.personDocuments.get(key).get(i).toString());
                System.out.println(textTwo);
            }
        }
    }
}
