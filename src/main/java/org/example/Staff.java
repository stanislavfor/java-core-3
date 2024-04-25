package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс для управления списком сотрудников
class Staff implements Iterable<Office> {
    List<Office> employees = new ArrayList<>();

    public void addEmployee(Office employee) {
        employees.add(employee);
    }

    public void printEmployeesName() {
        for (Office employee : employees) {
            System.out.println(employee.surname + " " + employee.name + ", " + employee.profession
                    + ", " + employee.address + ", age: " + employee.age
                    + ", salary: " + employee.calculateMonthlySalary());
        }
    }

    public void printEmployeesAge() {
        for (Office employee : employees) {
            System.out.println(employee.surname + " " + employee.name
                    + ", profession: " + employee.profession + ", age: " + employee.age + ", address: " + employee.address
                    + ", salary: " + employee.calculateMonthlySalary());
        }
    }

    public void printEmployeesProf() {
        for (Office employee : employees) {
            System.out.println(employee.profession + " - " + employee.name + " " + employee.surname
                    + ", " + employee.address + ", age: " + employee.age
                    + ", salary: " + employee.calculateMonthlySalary());
        }
    }

    public void printEmployeesPrice() {
        for (Office employee : employees) {
            System.out.println("salary (monthly): " + employee.calculateMonthlySalary() + ", " + employee.name + " " + employee.surname
                    + ", (" + employee.profession + ", address: " + employee.address + ", age: " + employee.age + ")");
        }
    }



    @Override
    public Iterator<Office> iterator() {

        return employees.iterator();
    }

}
