package ru.generate;

import ru.documents.entity.Document;

import java.util.*;

/**
 * Класс со всеми имеющимися коллекциями
 *
 * @author BespoyasovaV
 */
public final class CollectionsForAllYourNeeds {
    public static TreeMap<String, ArrayList<Document>> personAndDocument = new TreeMap<>();
    /**
     * хдесь хранятся все созданные документы без разбора
     */
    public static List<Document> listDocument = new ArrayList<>();
    public static List<String> listFio;
    public static List<String> arr;
    public static List<String> wordListOne;
    public static List<String> wordListTwo;
    public static List<String> textList;
    public static ArrayList<Integer> arrException = new ArrayList<>();

    static {
        listFio = Arrays.asList("Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна",
                "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна");
    }

    static {
        arr = Arrays.asList("Task", "Incoming", "Outgoing");
    }

    static {
        wordListOne = Arrays.asList("Доменная", "Схематичная", "Базовая", "Первичная");
    }

    static {
        wordListTwo = Arrays.asList("интеграция", "конфигурация", "верификация");
    }

    static {
        textList = Arrays.asList("Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку",
                "Как научиться вышивать?");
    }

    /**
     * метод заносит документы из listDocument в мапу и сортирует по авторам
     */
    public static void populate() {
        Collections.sort(CollectionsForAllYourNeeds.listDocument);
        for (int i = 0; i < listFio.size(); i++) {
            ArrayList<Document> docList = personAndDocument.get(CollectionsForAllYourNeeds.listFio.get(i));
            if (docList == null) {
                docList = new ArrayList<>();
            }
            for (Document document : listDocument) {
                if (document.getAuthor() == listFio.get(i)) {
                    docList.add(document);
                    personAndDocument.put(listFio.get(i), docList);
                }
            }
        }
    }

    /**
     * отображает отсортироанных по алфавиту авторов и их документы
     */
    public static void conclusion() {
        for (String key : personAndDocument.keySet()) {
            System.out.println(key);
            for (int i = 0; i < personAndDocument.get(key).size(); i++) {
                System.out.println("     " + personAndDocument.get(key).get(i).toString());
            }
        }
    }
}
