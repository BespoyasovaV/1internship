package ru.generate;

import ru.documents.exceptions.DocumentExistException;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Класс для генерации  рандомных значений
 *
 * @author BespoyasovaV
 */
public class RandomValue {
    public static int generateRandomNumber(int beforeNumber) throws DocumentExistException {
        int randNumber = (((int) (Math.random() * beforeNumber)) + 1);
        if (ProgramCollections.arrException.contains(randNumber)) {
            throw new DocumentExistException("Документ с генерируемым номером уже существует");
        } else {
            ProgramCollections.arrException.add(randNumber);
        }
        return randNumber;
    }

    public static String generateNameText() {
        int genText = (int) (Math.random() * 4);
        String newText = ProgramCollections.textList.get(genText);
        return newText;
    }

    public static Delivery generateDelivery() {
        int gen_del = new Random().nextInt(Delivery.values().length);
        return Delivery.values()[gen_del];
    }

    public static String generateNameDoc() {
        int rand1 = (int) (Math.random() * ProgramCollections.wordListOne.size());
        int rand2 = (int) (Math.random() * ProgramCollections.wordListTwo.size());
        String name = ProgramCollections.wordListOne.get(rand1) + " " +
                ProgramCollections.wordListTwo.get(rand2);
        return name;
    }

    public static String generateFio() {
        int fio_rand = (int) (Math.random() * 5);
        String fio = ProgramCollections.listFio.get(fio_rand);
        return fio;
    }

    public static Date generateDate() {
        int yearRand = (int) (2000 + Math.random() * 25);
        int monthRand = (int) (1 + Math.random() * 10);
        int dayRand = (int) (Math.random() * 29) + 1;
        Calendar calendar = new GregorianCalendar(yearRand, monthRand, dayRand);
        Date date = calendar.getTime();
        return date;
    }
}
