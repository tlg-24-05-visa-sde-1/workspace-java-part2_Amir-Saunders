package com.crisp;

import java.util.Comparator;

public class RadishGuysOnTopComparator implements Comparator<Radish> {

    @Override
    public int compare(Radish radish1, Radish radsish2) {
        return Integer.compare(radish1.getGuysOnTop(), radsish2.getGuysOnTop());
    }
}
