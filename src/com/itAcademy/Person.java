package com.itAcademy;

public class Person {

    public Person(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String toString() {
        return String.format("Имя сотрудника: %s. Должность: %s. Email: %s. Номер телефона: %s. Зарплата: %s. " +
                "Возраст: %s.", name, position, email, number, salary, age);
    }
}

