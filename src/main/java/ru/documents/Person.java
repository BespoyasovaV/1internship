package ru.documents;

import java.util.Objects;
import java.util.Set;

public class Person {
    String name;
    String Surname;
    String patronymic;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Person(String surname, String name, String patronymic) {

        this.name = name;
        this.Surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(Surname, person.Surname) && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname, patronymic);
    }
}
