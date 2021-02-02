package ru.documents.entity;

import java.text.MessageFormat;
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
    String sender;
    /**
     * Адресат
     */
    String destination;
    /**
     * Исходящий номер
     */
    int outgoingNum;
    /**
     * Исходящая дата регистрации
     */
    Date outgoingDate;

    /**
     * Название вида  документа
     */
    public String getSender() {
        return sender;
    }

    public String getDestination() {
        return destination;
    }

    public int getOutgoingNum() {
        return outgoingNum;
    }

    public Date getOutgoingDate() {
        return outgoingDate;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setOutgoingNum(int outgoingNum) {
        this.outgoingNum = outgoingNum;
    }

    public void setOutgoingDate(Date outgoingDate) {
        this.outgoingDate = outgoingDate;
    }

    public String toString() {
        String text = MessageFormat.format("Входящий № {0,number,integer} от {1,date} {2}", getReg_num(), getDateReg(), getName());
        return text;
    }
}

