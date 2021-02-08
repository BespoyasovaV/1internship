package ru.generate;

import ru.documents.exceptions.DocumentExistException;

import java.util.*;

/**
 * Класс для генерации  рандомных значений
 *
 * @author BespoyasovaV
 */
public class RandomValue {
    public static Random myRandom = new Random();

    /**
     * Метод генерирует регистрационный номер
     */
    public static int generateRandomNumber(int beforeNumber) throws DocumentExistException {
        int randNumber = 1 + myRandom.nextInt(beforeNumber);
        if (ProgramCollections.regNumCollection.contains(randNumber)) {
            throw new DocumentExistException("Документ с генерируемым номером уже существует");
        } else {
            ProgramCollections.regNumCollection.add(randNumber);
        }
        return randNumber;
    }

    /**
     * Метод возвращает рандомный элемент переданной коллекции
     */
    public static String generateListMeaning(List<String> list) {
        int randomValue = myRandom.nextInt(list.size());
        return list.get(randomValue);
    }

    /**
     * Метод возвращает рандомный элемент из enum Delivery
     */
    public static Enum generateEnum(Enum[] myEnum) {
        int randomEnum = myRandom.nextInt(myEnum.length);
        return myEnum[randomEnum];
    }

    /**
     * Метод генерирует дату
     */
    public static Date generateDate() {
        int yearRand = 2000 + myRandom.nextInt(25);
        int monthRand = 1 + myRandom.nextInt(10);
        int dayRand = 1 + myRandom.nextInt(29);
        Calendar calendar = new GregorianCalendar(yearRand, monthRand, dayRand);
        Date date = calendar.getTime();
        return date;
    }
}
