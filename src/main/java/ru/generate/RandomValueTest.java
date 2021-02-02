package ru.generate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

class RandomValueTest extends Assert {

    @Test
    void generateRandomNumber() {
        int randNumber = 10;
        ProgramCollections.arrException.add(9);
        boolean res = false;
        boolean answer = ProgramCollections.arrException.contains(randNumber);
        assertEquals(res, answer);

    }

    @Test
    void generateNameText() {
        int genText = 3;
        String newText = ProgramCollections.textList.get(genText);
        String result = "Чек-лист по заработку";
        assertEquals(newText, result);
    }

    @Test
    void generateDelivery() {
        int gen_del = 2;
        Delivery del = Delivery.values()[gen_del];
        Delivery res = Delivery.RUSSIAN_POST;
        assertEquals(del, res);
    }

    @Test
    void generateNameDoc() {
        int rand1 = 2;
        int rand2 = 1;
        String name = ProgramCollections.wordListOne.get(rand1) + " " +
                ProgramCollections.wordListTwo.get(rand2);
        String result = "Доменная верификация";
        assertEquals(name, result);
    }

    @Test
    void generateFio() {
        int fio_rand = 4;
        String fio = ProgramCollections.listFio.get(fio_rand);
        String res = "Барсуков Сергей Геннадиевич";
        assertEquals(res, fio);
    }

    @Test
    void generateDate() {
        int yearRand = 2025;
        int monthRand = 10;
        int dayRand = 1;
        Calendar calendar = new GregorianCalendar(yearRand, monthRand, dayRand);
        Calendar calendar1 = new GregorianCalendar(2025, 10, 1);
        assertEquals(calendar1, calendar);
    }
}