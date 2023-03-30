package com.example.junittestdemo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.Arrays;


@SpringBootTest
class CalculatorTest {


    Calculator calculator=new Calculator();
    @Test
    @DisplayName("AssertEquals Test Case")
    void doAddition() {

        int actualResult=calculator.doAddition(100,200);
        int expectedResult=300;
        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Test
    @DisplayName("AssertNotEquals Test Case")
    void doSubtraction() {

        int actualResult=calculator.doSubtraction(100,200);
        int expectedResult=100;
        Assertions.assertNotEquals(expectedResult,actualResult);
    }


    @Test
    @DisplayName("AssertArrayEquals Test Case")
    void assertArrayEquals(){
        int[] actual ={1,2,3,4,5};
        int[] expected ={1,2,3,4,5};

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    @DisplayName("AssertIterableEquals Test Case")
    void assertIterableEquals(){
        Iterable<Integer> actual=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterable<Integer> expected=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Assertions.assertIterableEquals(expected,actual);
    }

    @Test
    @DisplayName("AssertTrue Test Case")
    void assertTrue(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("AssertFalse Test Case")
    void assertFalse(){

        Assertions.assertFalse(false);
    }

    @Test
    @DisplayName("AssertNotNull Test Case")
    void assertNotNull(){
        String s1=null;
        String s2="Hello";

        Assertions.assertNotNull(s2);
    }


    @Test
    @DisplayName("AssertThrows Test Case")

    void assertThrowTest(){
        Assertions.assertThrows(ArithmeticException.class,()->calculator.doDivision(10,0));
    }



    @Test
    @DisplayName("AssertAll Test Case")
    void assertAllTest(){
        Assertions.assertAll(
                ()->{
                    Assertions.assertEquals(5,calculator.doAddition(2,3));
                    Assertions.assertEquals(6,calculator.doSubtraction(9,3));
                }
        );
    }


//    @Test
//    @DisplayName("AssertFail Test Case")
//    void assertFailTest(){
//        Assertions.fail();
//    }


    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All Called....");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All  called....");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each Called....");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each  called....");
    }

}