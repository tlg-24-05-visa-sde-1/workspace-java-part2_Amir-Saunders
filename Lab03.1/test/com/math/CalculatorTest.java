/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

    private Calculator calc;
//    this is to give an object or class that your trying to test. You make it a field


    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
//        @BeforeClass means it fires first after everything happens
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After class");
//        @AfterClass means it fires first before anything happens
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        calc = new Calculator();
        /*the setup method is used to instate the object that is a field above so now we can use calc that's been instantieted as anew calcualtor so now we can use calc in all the test methods it fires before each test with the annotation @Before*/
    }

    @After
    public void cleanUp()  {
        System.out.println("clean up");
//        with the annotation after this method is called after a test method fires after a test
    }

    @Test
    public void testIsEven() {
        System.out.println("Test is even");

        assertTrue(calc.isEven(10));
//        The assertTrue() method in JUnit testing checks whether the boolean value inside the parentheses evaluates to true
        assertFalse(calc.isEven(11));
//        The assertFalse() method in JUnit testing checks whether the boolean value inside the parentheses evaluates to false
//        assert. true or false gives true or false based on the method.

    }

    @Test
    public void name() {
    }

    @Test
    public void testDivide() {
        System.out.println("test divide");
        assertEquals(2.5,calc.divide(5,2), .001);
//        the .001 is a delta and is used when your doing calculations with doubles invloved
    }

    @Test
    public void testAdd() {
        System.out.println("test add");
        assertEquals(5, calc.add(1, 4));// expected, actual
//        This checks the add method inside calculator junit test must be same package like it is here. First parameter is always what the expected outcome will be.
    }
}