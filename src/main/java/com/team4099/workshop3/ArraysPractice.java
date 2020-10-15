package com.team4099.workshop3;

import java.util.*;

public class ArraysPractice {

    //Iterate
    public static int[] makeArray(){
        // Make an array
        int[] arr = {1,2,3,4};
        return arr;
    }

    public static List<Integer> makeArrayList(){
        // Make an ArrayList
        List<Integer> ans = new ArrayList<Integer>();
        return ans;
    }
    
    public static List<Integer> arrayListFunctions(List<Integer> arr, int addNum, int removeNum, int getNum){
        // Add addNum to the array, remove removeNum from the array, set the first index to the size, 
        // and set the second index to the element at the index getNum
        arr.add(addNum);
        arr.remove(removeNum);
        arr.set(0, arr.size());
        arr.set(1, arr.get(getNum));
        return arr;
    }

    public static int summation(List<Integer> arr){
        // Return the sum of every element in the list using a foreach loop
        int sum = 0;

        for(int i:arr){
            sum = sum +i;
        }
        return sum;
    }

    public static int summationFor(List<Integer> arr){
        // Return the sum of every element in the list using a for loop
        int sum = 0;

        for(int i = 0; i <arr.size();i++){
            sum = sum +arr.get(i);
        }
        return sum;
    }
}
