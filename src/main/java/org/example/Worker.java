package org.example;

// Класс потомок для работников с фиксированной оплатой Worker
class Worker extends Office {
    double monthlySalary;

    public Worker(String name, String surname, String address, String phone, int age, String profession, double monthlySalary) {
        super(name, surname, address, phone, age, profession);
        this.monthlySalary = monthlySalary;
    }


// Среднемесячная зарплата monthlySalary для работников с фиксированной оплатой Worker:
// "среднемесячная заработная плата = фиксированная месячная оплата"

    @Override
    public double calculateMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("WORKER : %s  %s, age: %d, phone: %s, profession: %s, monthly salary: %.2f",
                this.name, this.surname, this.age, this.phone, this.profession, this.monthlySalary);
    }

}

