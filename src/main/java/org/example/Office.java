package org.example;


// Базовый абстрактный класс
abstract class Office {
    String name;
    String surname;
    String address;
    String phone;
    int age;
    String profession;

    public Office(String name, String surname, String address, String phone, int age, String profession) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.profession = profession;
    }

    // Абстрактный метод для расчета среднемесячной заработной платы
    public abstract double calculateMonthlySalary();
}
