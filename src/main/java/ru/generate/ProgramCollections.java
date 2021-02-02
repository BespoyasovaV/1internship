package ru.generate;

import ru.documents.entity.Document;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.*;

/**
 * Класс со всеми имеющимися  коллекциями
 *
 * @author BespoyasovaV
 */
public final class ProgramCollections {
    public static Map<String, ArrayList<Document>> personDocuments = new TreeMap<>();
    /**
     * Здесь хранятся все созданные документы без разбора
     */
    public static TreeSet<Document> Documents = new TreeSet<>();
    /**
     * Колеекция с ФИО
     */
    public static List<String> listFio;
    /** Две коллекции с названием документов */
    public static List<String> wordListOne;
    public static List<String> wordListTwo;
    /** Коллекция с текстами документов*/
    public static List<String> textList;
    /** Коллекция, хранящая в себе регистрационные номера*/
    public static ArrayList<Integer> arrException = new ArrayList<>();




    static {
        listFio = Arrays.asList("Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна",
                "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна");
        wordListOne = Arrays.asList("Доменная", "Схематичная", "Базовая", "Первичная");
        wordListTwo = Arrays.asList("интеграция", "конфигурация", "верификация");
        textList = Arrays.asList("Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку",
                "Как научиться вышивать?");
    }
}
