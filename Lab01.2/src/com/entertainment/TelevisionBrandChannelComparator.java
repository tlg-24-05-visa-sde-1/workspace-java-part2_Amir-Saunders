package com.entertainment;

import java.util.Comparator;

public class TelevisionBrandChannelComparator implements Comparator<Television> {


    @Override
    public int compare(Television tv1, Television tv2) {
        int result = tv1.getBrand().compareTo(tv2.getBrand());
        if(result == 0){
           /* compareto can result in a negative number meaning it's less than, 0 meaning it's even, and a postive number meaning it's greater than and that is how we're comapring result which is the camparison to 0. So essentially if the first comparison is even or zero we're going to compare channels to break the tie*/
            result = Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
        }
        return result;
    }
}
