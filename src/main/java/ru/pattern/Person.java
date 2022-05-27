package ru.pattern;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        if (age != 0) {
            return true;
        }
        return false;
    }


    public boolean hasAddress() {
        if (adress == null) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void happyBirthday() {
        if (age != 0) {
            age = age++;
        }
        age = 0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return 0;
    }


    public PersonBilder newChildBilder() {
        return new PersonBilder().setSurname(surname).setAddress(adress).setAge(12);
    }

}
