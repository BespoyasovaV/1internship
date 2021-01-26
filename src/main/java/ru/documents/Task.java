package ru.documents;

import ru.documents.factory.DocumentCreate;

import java.util.ArrayList;

public class Task extends Document implements DocumentCreate {
    String date_issue;
    int term;
    String executor_name;
    Boolean sign;
    Boolean controller;
    String name_first = "Поручение";
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

    public int getTerm() {
        return term;
    }
    public String getDate_issue() {
        return date_issue;
    }
    public String getExecutor_name() {
        return executor_name;
    }
    public Boolean getSign() {
        return sign;
    }
    public Boolean getController() {
        return controller;
    }

//setters

    public void setController(Boolean controller) {
        this.controller = controller;
    }
    public void setSign(Boolean sign) {
        this.sign = sign;
    }
    public void setExecutor_name(String executor_name) {
        this.executor_name = executor_name;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public void setDate_issue(String date_issue) {
        this.date_issue = date_issue;
    }

    //constructor
    public Task(int id, String name, String text, int reg_num, String date_reg, String author, String date_issue, int term, String executor_name, boolean sign, boolean controller) {
        super(id, name, text, reg_num, date_reg, author);
        this.date_issue = date_issue;
        this.term = term;
        this.executor_name = executor_name;
        this.sign = sign;
        this.controller = controller;
    }

    @Override
    public String toString() {
        System.out.println("   " + author);
        try {
            System.out.print(name_first + " " + "№" + getCheck_num() + " " + "от" + " " + getDate_reg() + " " + getName());
        } catch (DocumentExistException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        return null;
    }


}

