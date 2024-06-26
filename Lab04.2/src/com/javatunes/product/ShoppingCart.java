/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart<T extends Product> {
//    above this means that anything that extends product can go in this list. T is a placeholder
    // storage for the cart's contents
    private Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T


    public double total(){
        double result = 0.0;
        for(T item : items){
            result += item.getPrice();
        }
        return result;
    }
    public int size(){
        return items.size();
    }

    public  Collection <T> allItems(){
        return Collections.unmodifiableCollection(items);
    };


    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }
}