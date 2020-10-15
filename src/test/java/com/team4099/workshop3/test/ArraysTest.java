package com.team4099.workshop3.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.team4099.workshop3.ArraysPractice;

public class ArraysTest {
    @Test
    @DisplayName("Make Array Test")
    void test1() {
        assertTrue(ArraysPractice.makeArray() instanceof int[]);
    }

    @Test
    @DisplayName("Make ArrayList Test")
    void test2() {
        assertTrue(ArraysPractice.makeArrayList() instanceof List);
    }

    @Test
    @DisplayName("ArrayList Functions Test - Adding")
    void test3() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        int addNum = 11;
        int removeNum = 3;
        int getNum = 4;
        assertTrue(ArraysPractice.arrayListFunctions(arr, addNum, removeNum, getNum).contains(addNum));
    }

    @Test
    @DisplayName("ArrayList Functions Test - Removing")
    void test4() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        ArrayList<Integer> arrC = new ArrayList<Integer>(arr);
        int addNum = 11;
        int removeNum = 3;
        int getNum = 4;
        assertFalse(ArraysPractice.arrayListFunctions(arrC, addNum, removeNum, getNum).contains(arr.get(removeNum)));
    }

    @Test
    @DisplayName("ArrayList Functions Test - Setting Size")
    void test5() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        ArrayList<Integer> arrC = new ArrayList<Integer>(arr);
        int addNum = 11;
        int removeNum = 3;
        int getNum = 4;
        assertEquals(arr.size(),ArraysPractice.arrayListFunctions(arrC, addNum, removeNum, getNum).get(0));
    }

    @Test
    @DisplayName("ArrayList Functions Test - Getting")
    void test6() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        ArrayList<Integer> arrC = new ArrayList<Integer>(arr);
        int addNum = 11;
        int removeNum = 3;
        int getNum = 2;
        assertEquals(arr.get(getNum),ArraysPractice.arrayListFunctions(arrC, addNum, removeNum, getNum).get(1));
    }

    @Test
    @DisplayName("Summation Test 1")
    void test7() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        assertEquals(25,ArraysPractice.summation(arr));
    }

    @Test
    @DisplayName("Summation Test 2")
    void test8() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0,0,0,4,0,7,1,3,8,11));
        assertEquals(34,ArraysPractice.summation(arr));
    }

    @Test
    @DisplayName("SummationFor Test 1")
    void test9() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        assertEquals(25,ArraysPractice.summationFor(arr));
    }

    @Test
    @DisplayName("SummationFor Test 2")
    void test10() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0,0,0,4,0,7,1,3,8,11));
        assertEquals(34,ArraysPractice.summationFor(arr));
    }
}
