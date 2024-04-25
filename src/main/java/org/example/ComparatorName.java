package org.example;

import java.util.Comparator;

public class ComparatorName implements Comparator<Office> {
    public int compare(Office o1, Office o2) {
        return CharSequence.compare(o1.surname, o2.surname);
    }

}
