package ru.documents;

import ru.generate.RandomValue;

import java.util.ArrayList;

/**
 * наследник класса Document, нужен для создания исходящих документов
 */
public class Outgoing extends Document {
    String destination;
    RandomValue.Delivery delivery;
    String name_first = "Исходящий";
    int check_num = 0;
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

}
