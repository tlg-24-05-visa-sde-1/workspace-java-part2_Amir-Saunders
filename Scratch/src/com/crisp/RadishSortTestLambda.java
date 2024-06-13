package com.crisp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RadishSortTestLambda {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red",1.5,2.5,5));
        radishes.add(new Radish("black",1.0,0.0,0));
        radishes.add(new Radish("red",2.7,5.5,0));
        radishes.add(new Radish("pink",0.9,0.0,6));

//        dump(radishes);

        radishes.sort(null);
        //this sorts the list by natural order and in this case it's size by passing null. We made size the natural order because it is in the compare to method in Radish that extends                compareable
        //dump(radishes);
        // Sort by radish color using radishcolorcomaprator class below

        radishes.sort(new RadishColorComaprator());
        /*When you use this we're instatiating the RadsishColorCaparator which extends comparator. when you sort using  new RadishColorComaprator() with a list it automatiaclly calls the compare method inside radishcolorcomaprator*/

        System.out.println("sort by guys on top by way of lambda");
       radishes.sort((r1,r2) -> Integer.compare(r1.getGuysOnTop(), r2.getGuysOnTop()));
       dump(radishes);
        System.out.println();

        //        Sort by radish guysOnTop using radishcolorcomaprator class below
        System.out.println(" sort via color via lambda");
        radishes.sort((r1,r2)-> r1.getColor().compareTo(r2.getColor()));
        dump(radishes);
        System.out.println();


        System.out.println("Sort by tail length via lambda");
        radishes.sort((r1,r2) -> Double.compare(r1.getTailLength(),r2.getTailLength()));
        dump(radishes);
        System.out.println();


    }




    private static void dump(List<Radish> radishList) {
        for(Radish radish : radishList){
            System.out.println(radish);
        }
    }
}
