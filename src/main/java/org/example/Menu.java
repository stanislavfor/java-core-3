package org.example;

import java.util.Collections;
import java.util.Scanner;

public class Menu {

    public void start() {
        // Список сотрудников
        Staff staff = new Staff();
        staff.addEmployee(new Freelancer("Sem", "Smith", "Moscow", "123456", 30, "Developer", 50));
        staff.addEmployee(new Worker("Rita", "Johnson", "Saratov", "654321", 28, "Designer", 3000));
        staff.addEmployee(new Freelancer("Marianna", "Smith", "Moscow", "123455", 27, "Manager", 40));
        staff.addEmployee(new Worker("Roy", "Toronto", "Novosibirsk", "654310", 38, "Web engineer", 35000));
        staff.addEmployee(new Freelancer("John", "Denni", "Tambov", "155667", 40, "Designer", 500));
        staff.addEmployee(new Worker("Pit", "Montes", "Krasnoyarsk", "654340", 48, "Programmer", 36800));
        staff.addEmployee(new Freelancer("Nik", "Ivanov", "Kursk", "155667", 40, "Programmer", 500));
        staff.addEmployee(new Worker("Antone", "Peres", "St.Petersburg", "255540", 35, "Administrator", 3800));

        // Вывод информации о сотрудниках с использованием forEach
        System.out.println("Employee list");
        staff.forEach(employee -> System.out.println(employee));


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Sort ");
            System.out.println("1. by surname");
            System.out.println("2. by age");
            System.out.println("3. by profession");
            System.out.println("4. by salary");
            System.out.println("0. Exit");
            System.out.print("Enter a index : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // Сортировка сотрудников по фамилии
                    System.out.println("Sort by surname : ");
                    Collections.sort(staff.employees, new ComparatorName());
                    staff.printEmployeesName();
                    break;

                case 2:
                    // Сортировка сотрудников по возрасту
                    System.out.println("Sort by age : ");
                    Collections.sort(staff.employees, new ComparatorAge());
                    staff.printEmployeesAge();
                    break;

                case 3:
                    // Сортировка сотрудников по профессиям
                    System.out.println("Sort by profession : ");
                    Collections.sort(staff.employees, new ComparatorProf());
                    // Вывод информации о сотрудниках
                    staff.printEmployeesProf();
                    break;

                case 4:
                    // Сортировка сотрудников по средней зарплате
                    System.out.println("Sort by salary : ");
                    Collections.sort(staff.employees, new ComparatorPrice());
                    staff.printEmployeesPrice();
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("reload a choice");



            }
        }
    }
}
