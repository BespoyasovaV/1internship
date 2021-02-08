package ru.documents.process;

import ru.documents.entity.Document;
import ru.documents.entity.Incoming;
import ru.documents.entity.Outgoing;
import ru.documents.entity.Task;
import ru.generate.PersonDocuments;
import ru.generate.ProgramCollections;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Класс фильтрует авторов и документы
 *
 * @author BespoyasovaV
 */
public class ProcessingDocuments {
    /**
     * метод заносит документы из listDocument в мапу и сортирует по авторам
     */
    public static void populate() {
        for (String fio : ProgramCollections.listFio) {
            List<Document> docList = PersonDocuments.personDocuments.get(fio);
            if (docList == null) {
                docList = new ArrayList<>();
            }
            for (Document document : ProgramCollections.documents) {
                if (document.getAuthor().equals(fio)) {
                    docList.add(document);
                    PersonDocuments.personDocuments.put(fio, docList);
                }
            }
        }
    }

    /**
     * отображает отсортированных по алфавиту авторов и их документы
     */
    public static void conclusion() {

        for (String key : PersonDocuments.personDocuments.keySet()) {
            String fio = MessageFormat.format("{0}", key);
            System.out.println(fio);
            Collections.sort(PersonDocuments.personDocuments.get(key));
            for (int i = 0; i < PersonDocuments.personDocuments.get(key).size(); i++) {
                checkDocument((PersonDocuments.personDocuments.get(key).get(i)));
            }
        }
    }

    public static void checkDocument(Document document) {
        if (document instanceof Task) {
            System.out.println(MessageFormat.format("   Поручение № {0,number,integer} от {1,date} {2}",
                    document.getRegNumber(),
                    document.getRegistrationDate(),
                    document.getName()));
        }
        if (document instanceof Incoming) {
            System.out.println(MessageFormat.format("   Входящий № {0,number,integer} от {1,date} {2}",
                    document.getRegNumber(),
                    document.getRegistrationDate(),
                    document.getName()));
        }
        if (document instanceof Outgoing) {
            System.out.println(MessageFormat.format("   Исходящий № {0,number,integer} от {1,date} {2}",
                    document.getRegNumber(),
                    document.getRegistrationDate(),
                    document.getName()));
        }
    }
}
