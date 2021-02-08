package ru.generate;

import ru.documents.entity.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Класс со всеми имеющимися  коллекциями для документов
 *
 * @author BespoyasovaV
 */
public final class ProgramCollections {
    /**
     * Здесь хранятся все созданные документы без разбора
     */
    public static List<Document> documents = new ArrayList<>();
    /**
     * Коллекция с ФИО
     */
    public static List<String> listFio;
    /**
     * Две коллекции с названием документов
     */
    public static List<String> wordListOne;
    /**
     * Коллекция с текстами документов
     */
    public static List<String> textList;
    /**
     * Коллекция, хранящая в себе регистрационные номера
     */
    public static List<Integer> regNumCollection = new ArrayList<>();

    static {
        listFio = Arrays.asList("Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна",
                "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна");
        wordListOne = Arrays.asList("Доменная интеграция", "Схематичная интеграция", "Базовая интеграция",
                "Первичная интеграция", "Доменная конфигурация", "Схематичная конфигурация", "Базовая конфигурация",
                "Первичная конфигурация", "Доменная верификация", "Схематичная верификация", "Базовая верификация",
                "Первичная верификация");
        textList = Arrays.asList("Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку",
                "Как научиться вышивать?");
    }
}
