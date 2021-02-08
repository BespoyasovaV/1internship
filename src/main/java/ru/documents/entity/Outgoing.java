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
    private String destination;
    /**
     * Способ  доставки
     */
    private Delivery delivery;

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

    @Override
    public String toString() {
        return "Outgoing{" +
                "destination='" + destination + '\'' +
                ", delivery=" + delivery +
                '}';
    }

}
