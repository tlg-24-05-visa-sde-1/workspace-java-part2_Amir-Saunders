/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog;


import java.util.Collection;

class InMemoryCatalogTestMain {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
//         testFindById();
        // testFindByKeyword();
//         testFindByCategory();
        // testSize();
        // testGetAll();
        testAveragePrice();

    }

    private static void testAveragePrice(){
        InMemoryCatalog catalog = new InMemoryCatalog();
        double average = catalog.averagePrice();
        System.out.println(average);
    }



    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(6L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(101L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> pop = catalog.findByCategory(MusicCategory.POP);
        dump(pop);
    }

    private static void testSize() {
    }

    private static void testGetAll() {
    }

    private static void dump(Collection<MusicItem> items){
        for(MusicItem item : items){
            System.out.println(item);
        }
    }
}