package ru.documents.entity;

import ru.generate.Delivery;

import java.text.MessageFormat;

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
    public String getDestination() {
        return destination;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString() {
        String text = MessageFormat.format("Исходящий № {0,number,integer} от {1,date} {2}", getReg_num(), getDateReg(), getName());
        return text;
    }
}
