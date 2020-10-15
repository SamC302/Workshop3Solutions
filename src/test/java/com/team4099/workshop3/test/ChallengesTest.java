package com.team4099.workshop3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.team4099.workshop3.Challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChallengesTest {
    @Test
    @DisplayName("Remove Duplicates 1 Test")
    void test1() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,3,2,1,5));
        ArrayList<Integer> ansArr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertEquals(ansArr,Challenges.removeDuplicates1(arr));
    }

    @Test
    @DisplayName("Remove Duplicates 2 Test")
    void test2() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,3,3,4,5,5));
        ArrayList<Integer> ansArr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertEquals(ansArr,Challenges.removeDuplicates2(arr));
    }

    @Test
    @DisplayName("Shell Game Test 1")
    void test3() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        List<List<Integer>> swapArr = new ArrayList<List<Integer>>();
        swapArr.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        assertEquals(2,Challenges.shellGame(arr,swapArr,2));
    }

    @Test
    @DisplayName("Shell Game Test 2")
    void test4() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        List<List<Integer>> swapArr = new ArrayList<List<Integer>>();
        swapArr.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        swapArr.add(new ArrayList<Integer>(Arrays.asList(2,3)));
        swapArr.add(new ArrayList<Integer>(Arrays.asList(1,4)));
        assertEquals(3,Challenges.shellGame(arr,swapArr,4));
    }

    @Test
    @DisplayName("Omnipresent Test 1")
    void test5() {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2,11,3,4,3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1,4,10,5,3)));
        assertTrue(Challenges.omnipresent(arr,3));
    }

    @Test
    @DisplayName("Omnipresent Test 2")
    void test6() {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2,11,3,4,3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1,4,10,5,3)));
        assertFalse(Challenges.omnipresent(arr,3));
    }

    @Test
    @DisplayName("Consecutive Test 1")
    void test7() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,4,2));
        assertTrue(Challenges.consecutive(arr));
    }

    @Test
    @DisplayName("Consecutive Test 2")
    void test8() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,4,2,100));
        assertFalse(Challenges.consecutive(arr));
    }

    @Test
    @DisplayName("Consecutive Test 3")
    void test9() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,4,2,2));
        assertFalse(Challenges.consecutive(arr));
    }
}
