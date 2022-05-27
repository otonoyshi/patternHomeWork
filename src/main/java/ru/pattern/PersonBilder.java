package ru.pattern;

public class PersonBilder {

    private String name;
    private String surname;
    private int age;
    private String adress;




    public PersonBilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBilder setAge(int age) {
        if(age > 0){
            this.age = age;
            return this;
        }
        throw new IllegalArgumentException();
    }
    public PersonBilder setAddress(String address) {
        this.adress = address;
        return this;
    }




    public Person build(){
        if (name != null && surname != null && age != 0){
                return new Person(name,surname,age);
        } throw new IllegalStateException();

    }




}
