package com.team4099.workshop3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Challenges {
    public static List<Integer> removeDuplicates1(List<Integer> arr){
        // Remove duplicates from an ArrayList using one for loop and one if statement
        List<Integer> newArr = new ArrayList<Integer>();
        for(int i: arr){
            if (!newArr.contains(i)){
                newArr.add(i);
            }
        }
        return newArr;
    }

    public static List<Integer> removeDuplicates2(List<Integer> arr){
        // Remove duplicates from an ArrayList using one for loop and one while loop
        List<Integer> newArr = new ArrayList<Integer>();
        int current = -1;
        for(int i = 0; i < arr.size()-1;i++){
            current = arr.get(i);
            newArr.add(arr.get(i));
            while(arr.get(i+1) == current && i+1 < arr.size()-1){
                i++;
            }
        }
        return newArr;
    }
    
    public static int shellGame(List<Integer> shells, List<List<Integer>> swaps, int finalShell){
        // Given an array of shells, and an array of swap array (where the the 2 numbers are the indexes to swap),
        // return the shell at the given position after the game has been played
        int temp = 0;
        for(List<Integer> s: swaps){
            temp = shells.get(s.get(0));
            shells.set(s.get(0),shells.get(s.get(1)));
            shells.set(s.get(1),temp);
        }
        return shells.get(finalShell);
    }

    public static boolean omnipresent(List<List<Integer>> arr,int element){
        // Check if a element is in every sublist
        for(List<Integer> a:arr){
            if(!a.contains(element)){
                return false;
            }
        }
        return true;
    }

    public static boolean consecutive(List<Integer> arr){
        // Check if this array can be represented as a distinct consecutive list of numbers
        Collections.sort(arr);
        for(int i =0;i<arr.size()-1;i++){
            if(arr.get(i+1)-arr.get(i) != 1){
                return false;
            }
        }
        return true;
    }
}
