package ru.generate;

import ru.documents.DocumentExistException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Класс для генерации рандомных значений
 *
 * @author BespoyasovaV
 */
public class RandomValue {

    public static List<String> listFio = Arrays.asList("Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна",
            "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна");

    public static List<String> arr = Arrays.asList("Task", "Incoming", "Outgoing");
    static List<String> wordListOne = Arrays.asList("Доменная", "Схематичная", "Базовая", "Первичная");
    static List<String> wordListTwo = Arrays.asList("интеграция", "конфигурация", "верификация");
    static List<String> textList = Arrays.asList("Текст про птичек", "Текст про бабочек", "Биографя Шрека",
            "Чек-лист по заработку", "Как научиться вышивать?");
    static ArrayList<Integer> arrException = new ArrayList<>();
    public int one = wordListOne.size();
    public int two = wordListTwo.size();

    public enum Delivery {
        Самовывоз,
        Курьером,
        ПочтаРоссии
    }

    public static int generateRandomNumber(int beforeNumber) throws DocumentExistException {
        int rand_number = (int) (Math.random() * beforeNumber);
        if (arrException.contains(rand_number)) {
            DocumentExistException docE = new DocumentExistException();
        } else {
            arrException.add(rand_number);
        }
        return rand_number;
    }

    public String generateNameText() {
        int genText = (int) (Math.random() * 4);
        String newText = textList.get(genText);
        return newText;
    }

    public Delivery generateDelivery() {
        int gen_del = new Random().nextInt(Delivery.values().length);
        return Delivery.values()[gen_del];
    }

    public String generateNameDoc() {
        int rand1 = (int) (Math.random() * one);
        int rand2 = (int) (Math.random() * two);
        String name = wordListOne.get(rand1) + " " + wordListTwo.get(rand2);
        return name;
    }

    public String generateFio() {
        int fio_rand = (int) (Math.random() * 3);
        String fio = listFio.get(fio_rand);
        return fio;
    }

    public String generateDate() {
        java.util.Random day = new java.util.Random();
        int max1 = 28;
        int min1 = 1;
        int d = day.nextInt((max1 - min1) + 1) + min1;
        java.util.Random month = new java.util.Random();
        int max2 = 12;
        int min2 = 1;
        int m = month.nextInt((max2 - min2) + 1) + min2;
        java.util.Random year = new java.util.Random();
        int max3 = 2021;
        int min3 = 2000;
        int y = year.nextInt((max3 - min3) + 1) + min3;
        String date1 = y + "-" + m + "-" + d;
        return date1;
    }


}
