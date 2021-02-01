package ru.generate;

import ru.documents.DocumentExistException;

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
        int rand_number = (((int) (Math.random() * beforeNumber)) + 1);
        if (CollectionsForAllYourNeeds.arrException.contains(rand_number)) {
            throw new DocumentExistException("Документ с генерируемым номером уже существует");
        } else {
            CollectionsForAllYourNeeds.arrException.add(rand_number);
        }
        return rand_number;
    }

    public String generateNameText() {
        int genText = (int) (Math.random() * 4);
        String newText = CollectionsForAllYourNeeds.textList.get(genText);
        return newText;
    }

    public Delivery generateDelivery() {
        int gen_del = new Random().nextInt(Delivery.values().length);
        return Delivery.values()[gen_del];
    }

    public String generateNameDoc() {
        int rand1 = (int) (Math.random() * CollectionsForAllYourNeeds.wordListOne.size());
        int rand2 = (int) (Math.random() * CollectionsForAllYourNeeds.wordListTwo.size());
        String name = CollectionsForAllYourNeeds.wordListOne.get(rand1) + " " +
                CollectionsForAllYourNeeds.wordListTwo.get(rand2);
        return name;
    }

    public String generateFio() {
        int fio_rand = (int) (Math.random() * 5);
        String fio = CollectionsForAllYourNeeds.listFio.get(fio_rand);
        return fio;
    }

    public Date generateDate() {
        int yearRand = (int) (2000 + Math.random() * 25);
        int monthRand = (int) (1 + Math.random() * 10);
        int dayRand = (int) (Math.random() * 29) + 1;
        Calendar calendar = new GregorianCalendar(yearRand, monthRand, dayRand);
        Date date = calendar.getTime();
        return date;
    }
}
