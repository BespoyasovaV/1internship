package ru.documents;

import ru.documents.factory.DocumentCreate;
import ru.generate.RandomValue;

import java.util.ArrayList;

public class Outgoing extends Document implements DocumentCreate {
    String destination;
    RandomValue.Delivery delivery;
    String name_first = "Исходящий";
    int check_num = 0;

    //getters
    ArrayList<Integer> check_id = new ArrayList<Integer>();
//getters

    private int getCheck_num() throws DocumentExistException {
        check_num = (int) (Math.random() * 34);
        if (check_id.contains(check_num)) {
            throw new DocumentExistException();
        } else {
            check_id.add(check_num);
            return check_num;
        }

    }

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

    //constructor
    public Outgoing(int id, String name, String text, int reg_num, String date_reg, String author, String destination, RandomValue.Delivery delivery) {
        super(id, name, text, reg_num, date_reg, author);
        this.destination = destination;
        this.delivery = delivery;

    }

    @Override
    public String toString() {

        try {
            System.out.println("      " + author);
            System.out.print(name_first + " " + "№" + getCheck_num() + " " + "от" + " " + getDate_reg() + " " + getName());
        } catch (DocumentExistException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        return null;
    }


}
