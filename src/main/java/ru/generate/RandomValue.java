package ru.generate;

import ru.documents.Person;
import ru.documents.factory.DocumentCreate;
import ru.documents.factory.IncomingFactory;
import ru.documents.factory.OutgoingFactory;
import ru.documents.factory.TaskFactory;

import java.util.ArrayList;
import java.util.Random;

/**
 * класс для генерации рандомных значений
 */
public class RandomValue {
    int regNumForTask = 0;
    int regNumForIncoming = 0;
    int regNumForOutgoing = 0;
    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Integer> check_id = new ArrayList<Integer>();
    String[] arr = new String[]{"Task", "Incoming", "Outgoing"};
    String[] wordListOne = new String[]{"Доменная", "Схематичная", "Базовая", "Первичная"};
    String[] wordListTwo = new String[]{"интеграция", "конфигурация", "верификация"};
    public int one = wordListOne.length;
    public int two = wordListTwo.length;
    String[] textList = new String[]{"Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку",
            "Как научиться вышивать?"};
    public String[] listFio = new String[]{"Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна",
            "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна",};

    public enum Delivery {
        Самовывоз,
        Курьером,
        ПочтаРоссии
    }

    public int generateRandomNumber() {
        int rand_number = (int) (Math.random() * 7);
        return rand_number;
    }

    public String generateNameText() {
        int genText = (int) (Math.random() * 4);
        String newText = textList[genText];
        return newText;
    }

    public Delivery generateDelivery() {
        int gen_del = new Random().nextInt(Delivery.values().length);
        return Delivery.values()[gen_del];
    }

    public int generateId() {
        int id = (int) (Math.random() * 100);
        return id;

    }

    public String generateNameDoc() {
        int rand1 = (int) (Math.random() * one);
        int rand2 = (int) (Math.random() * two);
        String name = wordListOne[rand1] + " " + wordListTwo[rand2];
        return name;
    }

    public String generateFio() {
        int fio_rand = (int) (Math.random() * 3);
        String fio = listFio[fio_rand];
        return fio;
    }

    public int generateTerm() {
        int term = (int) (Math.random() * 56);

        return term;
    }

    public int generateIshNum() {
        int num = (int) (Math.random() * 10000);

        return num;
    }

    public boolean generateSign() {
        int sign = (int) (Math.random() * 100);
        if (sign / 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean generateController() {
        int sign = (int) (Math.random() * 100);
        if (sign / 2 == 0) {
            return false;
        } else {
            return true;
        }
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

    public DocumentCreate generateRandomFactory() {
        int generateRandomNum = (int) (Math.random() * 3);
        DocumentCreate documentCreate = null;
        if (arr[generateRandomNum] == "Task") {
            documentCreate = new TaskFactory();
            return documentCreate;
        }
        if (arr[generateRandomNum] == "Incoming") {
            documentCreate = new IncomingFactory();
            return documentCreate;
        }
        if (arr[generateRandomNum] == "Outgoing") {
            documentCreate = new OutgoingFactory();
        }
        return documentCreate;
    }
}
