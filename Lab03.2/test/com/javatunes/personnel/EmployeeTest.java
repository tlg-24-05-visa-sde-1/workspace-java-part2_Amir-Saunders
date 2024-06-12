package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee emp1;
    private Employee emp2;


    @Before
    public void setUp() {
//        emp1 = new DummyEmployee("John", Date.valueOf("2000-01-01"));
//        emp2 = new DummyEmployee("John", Date.valueOf("2000-01-01"));
        emp1 = new Employee("John", Date.valueOf("2000-01-01")){
            @Override
            public double pay() {
                return 0;
            }

            @Override
            public double payTaxes() {
                return 0;
            }
        };
        emp2 = new Employee("John", Date.valueOf("2000-01-01")) {
            @Override
            public double pay() {
                return 0;
            }

            @Override
            public double payTaxes() {
                return 0;
            }
        };

    }

    @Test
    public void equals_ShouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("Mary");
        assertFalse(emp1.equals(emp2));
    }

//    @Test
//    public void equals_ShouldReturnFalse_sametName_differentHireDate() {
//        emp2.setHireDate(Date.valueOf(""));
//    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2020-02-02"));
        assertNotEquals(emp1,emp2);
        assertFalse(emp1.equals(emp2));


    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp1,emp2);
        assertTrue(emp1.equals(emp1));
    }

    //Named level inner class
    private class DummyEmployee extends Employee {
        public DummyEmployee() {
        }

        public DummyEmployee(String name, Date hireDate) {
            super(name, hireDate);
        }

        @Override
        public double pay() {
            return 0;
        }

        @Override
        public double payTaxes() {
            return 0;
        }
    }


}