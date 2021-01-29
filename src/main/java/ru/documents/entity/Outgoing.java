package ru.documents.entity;

import ru.generate.RandomValue;

import java.util.ArrayList;

/**
 * Наследник класса Document, нужен для создания исходящих документов
 *
 * @author BespoyasovaV
 */
public class Outgoing extends Document {
    /**
     * Адресат
     */
    String destination;
    /**
     * Способ доставки
     */
    RandomValue.Delivery delivery;
    /**
     * Название вида документа
     */
    String name_first = "Исходящий";
    ArrayList<Integer> check_id = new ArrayList<Integer>();

    //getters
    public String getDestination() {
        return destination;
    }

    public RandomValue.Delivery getDelivery() {
        return delivery;
    }

    //setters
    public void setDelivery(RandomValue.Delivery delivery) {
        this.delivery = delivery;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString() {
        return name_first + " " + "№" + " " + getReg_num() + " " + "от" + " " + getDate_reg() + " " + getName();
    }

}
