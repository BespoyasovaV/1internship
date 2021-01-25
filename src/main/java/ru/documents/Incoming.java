package ru.documents;

import ru.documents.factory.DocumentCreate;

import java.text.MessageFormat;
import java.util.Locale;

public class Incoming extends Document implements DocumentCreate {
    String sender;
    String destination;
    int outgoing_num;
    String outgoing_date;
    String name_first = "Входящий";
    static int check_num = 0;

    //getters
    private static int getCheck_num() {
        check_num = check_num + 1;
        return check_num;
    }

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

    //constructor
    public Incoming(int id, String name, String text, int reg_num, String date_reg, Person author, String sender, String destination, int outgoing_num, String outgoing_date) {

        super(id, name, text, reg_num, date_reg, author);
        this.sender = sender;
        this.destination = destination;
        this.outgoing_num = outgoing_num;
        this.outgoing_date = outgoing_date;
    }

    MessageFormat formatter = new MessageFormat("");

    @Override
    public String toString() {
        System.out.println("      " + author.Surname + " " + author.name + " " + author.patronymic);
        System.out.print(name_first + " " + "№" + getCheck_num() + " " + "от" + " " + getDate_reg() + " " + getName());
        System.out.println(" ");
        return null;
    }

    @Override
    public void create() {
        System.out.print("Исходящий" + " ");

    }


    public String returnClass() {
        return "Incoming";
    }

}

