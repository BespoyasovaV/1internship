package ru.documents.entity;

import ru.generate.Delivery;

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
     * Способ  доставки
     */
    Delivery delivery;
    /**
     * Название вида документа
     */
    String name_first = "Исходящий";

    //getters
    public String getDestination() {
        return destination;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    //setters
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString() {
        int month = getDate_reg().getMonth() + 1;
        int year = getDate_reg().getYear() + 1900;
        if (month >=10) {
            return name_first + " " + "№" + " " + getReg_num() + " " + "от" + " " + getDate_reg().getDay() + "." + month + "." + year + " " + getName();
        }
        return name_first + " " + "№" + " " + getReg_num() + " " + "от" + " " + getDate_reg().getDay() + ".0" + month + "." + year + " " + getName();
    }
}
