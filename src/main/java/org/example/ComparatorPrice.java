package org.example;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Office> {

    @Override
    public int compare(Office o1, Office o2) {
        return Integer.compare((int) o2.calculateMonthlySalary(), (int) o1.calculateMonthlySalary());
    }

}
