package ru.documents;

import java.util.Comparator;

public class Document {

    int id;
    String name;
    String text;
    int reg_num;
    String date_reg;
    public Person author;


    //getters
    public int getId() {
        return id;
    }

    public int getReg_num() {
        return reg_num;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public Person getAuthor() {
        return author;
    }

    public String getDate_reg() {
        return date_reg;
    }
    //setters


    public void setAuthor(Person author) {
        this.author = author;
    }

    public void setDate_reg(String date_reg) {
        this.date_reg = date_reg;
    }

    public void setReg_num(int reg_num) {
        this.reg_num = reg_num;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    //constructor
    public Document(int id, String name, String text, int reg_num, String date_reg, Person author) {

        this.id = id;
        this.name = name;
        this.text = text;
        this.reg_num = reg_num;
        this.date_reg = date_reg;
        this.author = author;

    }

    public Document() {
    }


// реализация интерфейса Comparator

    class DocumentRegNumComparator implements Comparator<Document> {
        public int compare(Document a, Document b) {
            if (a.getReg_num() > b.getReg_num())
                return 1;
            if (a.getReg_num() < b.getReg_num())
                return -1;
            else return 0;
        }
    }


    class DocumentDateRegComparator implements Comparator<Document> {
        public int compare(Document a, Document b) {
            return a.getDate_reg().compareTo(b.getDate_reg());
        }
    }


}

