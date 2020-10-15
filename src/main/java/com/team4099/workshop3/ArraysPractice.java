package com.team4099.workshop3;

import java.util.*;

public class ArraysPractice {
    // Make ArrayList
    //Iterate
    //Add
    //Remove
    //Index

    public static int[] makeArray(){
        int[] arr = {1,2,3,4};
        return arr;
    }

    public static List<Integer> makeArrayList(){
        ArrayList<Integer> ans = new ArrayList<>();
        return ans;
    }
    
    public static List<Integer> arrayListFunctions(List<Integer> arr, int addNum, int removeNum, int getNum){
        arr.add(addNum);
        arr.remove(removeNum);
        arr.set(0, arr.size());
        arr.set(1, arr.get(getNum));
        return arr;
    }
}
