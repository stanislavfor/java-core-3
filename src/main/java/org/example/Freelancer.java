package org.example;

// Класс потомок для работников с почасовой оплатой Freelancer
class Freelancer extends Office {
    double hourlySalary;

    public Freelancer(String name, String surname, String address, String phone, int age, String profession, double hourlySalary) {
        super(name, surname, address, phone, age, profession);
        this.hourlySalary = hourlySalary;
    }


// Среднемесячная зарплата monthlySalary для Freelancer формула для расчета:
// "среднемесячная заработная плата = 20.8 * 8 * почасовая ставка"

    @Override
    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlySalary;
    }

    @Override
    public String toString() {
        return String.format("FREELANCER : %s %s, age: %d, phone: %s, profession: %s, hourly salary: %.2f",
                this.name, this.surname, this.age, this.phone, this.profession, this.hourlySalary);
    }
}


