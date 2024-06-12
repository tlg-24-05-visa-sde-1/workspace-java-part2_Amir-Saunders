package com.crisp;

import java.util.Comparator;

public class RadishColorComaprator implements Comparator<Radish> {

    @Override
    public int compare(Radish r1, Radish r2) {
        return Integer.compare(r1.getColor().compareTo(r2.getColor()), 0);
        // Here we're comparing strings using compareTo
    }
}
