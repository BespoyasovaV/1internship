package ru.documents;

import ru.documents.Document;

public class Outgoing extends Document implements DocumentCreate {
    String destination;
    String delivery;
    String name_first="Исходящий";
    static int check_num=0;
    //getters
    private static int getCheck_num() {
        check_num=check_num+1;
        return check_num;
    }
    public String getDestination() {
        return destination;
    }

    public String getDelivery() {
        return delivery;
    }
//setters

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    //constructor
    public Outgoing(int id, String name, String text, int reg_num, String date_reg, Person author, String destination, String delivery)
    {
        super(id, name, text, reg_num, date_reg, author);
        this.destination=destination;
        this.delivery=delivery;

    }

    @Override
    public String toString() {
        return "Адресат: "+destination+
                "Cпособ доставки+"+delivery;
    }

    @Override
    public void create() {
        System.out.print("Входящий"+" ");
    }

    @Override
    public void conclusion() {

        System.out.println("      " + author.name+" "+ author.Surname+" "+author.patronymic);
        //message format
        //toString переопр


    }

    @Override
    public void norm_concl() {

        System.out.print(name_first + " " + "№" + getCheck_num() + " " + "от" + " " + getDate_reg() + " " + getName());
        System.out.println(" ");
    }

    public String returnClass(){
        return "Outgoing";
    }
}
