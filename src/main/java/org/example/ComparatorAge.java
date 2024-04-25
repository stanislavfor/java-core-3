package org.example;

import java.util.Comparator;

// Компаратор для сортировки по возрасту
class ComparatorAge implements Comparator<Office> {
    @Override
    public int compare(Office o1, Office o2) {
        return Integer.compare(o1.age, o2.age);
    }

}
