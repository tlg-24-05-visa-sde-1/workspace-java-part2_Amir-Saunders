package com.crisp;

import java.util.Comparator;

public class RadishColorComaprator implements Comparator<Radish> {

    @Override
    public int compare(Radish r1, Radish r2) {
       return r1.getColor().compareTo(r2.getColor());
//       Here we're comapring strings using compareTo
    }
}
