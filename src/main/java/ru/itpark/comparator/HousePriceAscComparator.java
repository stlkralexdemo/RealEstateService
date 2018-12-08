package ru.itpark.comparator;

import ru.itpark.domain.House;

import java.io.Serializable;
import java.util.Comparator;


public class HousePriceAscComparator implements Comparator <House>, Serializable {

    @Override
    public int compare(House o1, House o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
