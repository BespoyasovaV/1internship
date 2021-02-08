package ru.documents.entity;

import java.util.Date;

/**
 * Наследник класса Document, нужен для создания входящих документов
 *
 * @author BespoyasovaV
 */
public class Incoming extends Document {
    /**
     * Отправитель
     */
    private String sender;
    /**
     * Адресат
     */
    private String destination;
    /**
     * Исходящий номер
     */
    private int outgoingNumber;
    /**
     * Исходящая дата регистрации
     */
    private Date outgoingDate;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(int outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public Date getOutgoingDate() {
        return outgoingDate;
    }

    public void setOutgoingDate(Date outgoingDate) {
        this.outgoingDate = outgoingDate;
    }

    @Override
    public String toString() {
        return "Incoming{" +
                "sender='" + sender + '\'' +
                ", destination='" + destination + '\'' +
                ", outgoingNum=" + outgoingNumber +
                ", outgoingDate=" + outgoingDate +
                '}';
    }
}

