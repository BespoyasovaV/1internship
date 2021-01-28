package ru.documents;

import java.util.Objects;

/**
 * этот класс понадобится позже
 */

public class Person {
    String name;
    String lastname;
    String patronymic;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        lastname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, patronymic);
    }
}
