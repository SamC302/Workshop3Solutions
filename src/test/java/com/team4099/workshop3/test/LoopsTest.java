package com.team4099.workshop3.test;

import com.team4099.workshop3.Loops;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopsTest {
    @Test
    @DisplayName("Sigma Test 1")
    void test1() {
        assertEquals(6,Loops.sigma(3));
    }
    @Test
    @DisplayName("Sigma Test 2")
    void test2() {
        assertEquals(1,Loops.sigma(1));
    }
    @Test
    @DisplayName("Sigma Test 3")
    void test3() {
        assertEquals(0,Loops.sigma(0));
    }
    @Test
    @DisplayName("Sigma Test 4")
    void test4() {
        assertEquals(5050,Loops.sigma(100));
    }

    @Test
    @DisplayName("Zero Test 1")
    void test5() {
        assertEquals(2,Loops.zero(2,4));
    }
    @Test
    @DisplayName("Zero Test 2")
    void test6() {
        assertEquals(11,Loops.zero(25,256));
    }
    @Test
    @DisplayName("Zero Test 3")
    void test7() {
        assertEquals(9,Loops.zero(10,81));
    }
    @Test
    @DisplayName("Zero Test 4")
    void test8() {
        assertEquals(0,Loops.zero(2,0));
    }

    @Test
    @DisplayName("Log Test 1")
    void test9() {
        assertEquals(2,Loops.log(4,2));
    }
    @Test
    @DisplayName("Log Test 2")
    void test10() {
        assertEquals(8,Loops.log(256,2));
    }
    @Test
    @DisplayName("Log Test 3")
    void test11() {
        assertEquals(4,Loops.log(81,3));
    }
    @Test
    @DisplayName("Log Test 4")
    void test12() {
        assertEquals(0,Loops.log(1,2));
    }

    @Test
    @DisplayName("Array Add Test 1")
    void test13() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> ansArr = new ArrayList<>(Arrays.asList(2,3,4,5));
        assertEquals(ansArr,Loops.arrayAdd(arr,1));
    }
    @Test
    @DisplayName("Array Add Test 2")
    void test14() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> ansArr = new ArrayList<>(Arrays.asList(3,4,5,6));
        assertEquals(ansArr,Loops.arrayAdd(arr,2));
    }
    @Test
    @DisplayName("Array Add Test 3")
    void test15() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> ansArr = new ArrayList<>(Arrays.asList(11));
        assertEquals(ansArr,Loops.arrayAdd(arr,10));
    }
    @Test
    @DisplayName("Array Add Test 4")
    void test16() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> ansArr = new ArrayList<>(Arrays.asList());
        assertEquals(ansArr,Loops.arrayAdd(arr,60));
    }
}

