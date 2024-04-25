package org.example;

// Компаратор для сортировки по возрасту

import java.util.Comparator;

public class ComparatorProf implements Comparator<Office> {
    @Override
    public int compare(Office o1, Office o2) {
        return CharSequence.compare(o1.profession, o2.profession);
    }
}
