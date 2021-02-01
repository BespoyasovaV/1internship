package ru.documents.entity;

import java.util.ArrayList;
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
    int outgoing_num;
    /**
     * Исходящая дата регистрации
     */
    Date outgoing_date;
    /**
     * Название вида документа
     */
    String name_first = "Входящий";
    ArrayList<Integer> check_id = new ArrayList<Integer>();

    //getters
    public String getSender() {
        return sender;
    }

    public String getDestination() {
        return destination;
    }

    public int getOutgoing_num() {
        return outgoing_num;
    }

    public Date getOutgoing_date() {
        return outgoing_date;
    }

    //setters
    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setOutgoing_num(int outgoing_num) {
        this.outgoing_num = outgoing_num;
    }

    public void setOutgoing_date(Date outgoing_date) {
        this.outgoing_date = outgoing_date;
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

