package ru.documents;

import java.util.ArrayList;

/**
 * наследник класса Document, нужен для создания входящих документов
 */
public class Incoming extends Document {
    String sender;
    String destination;
    int outgoing_num;
    String outgoing_date;
    String name_first = "Входящий";
    int check_num = 0;
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

    public String getOutgoing_date() {
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

    public void setOutgoing_date(String outgoing_date) {
        this.outgoing_date = outgoing_date;
    }

}

