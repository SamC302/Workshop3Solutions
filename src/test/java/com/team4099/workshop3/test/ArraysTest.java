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
    @DisplayName("ArrayList Functions Test 1 - Adding")
    void test3() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        int addNum = 11;
        int removeNum = 3;
        int getNum = 4;
        assertTrue(ArraysPractice.arrayListFunctions(arr, addNum, removeNum, getNum).contains(addNum));
    }

    @Test
    @DisplayName("ArrayList Functions Test 1 - Removing")
    void test4() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7,9));
        int addNum = 11;
        int removeNum = 3;
        int getNum = 4;
        assertFalse(ArraysPractice.arrayListFunctions(arr, addNum, removeNum, getNum).contains(7));
    }
}
