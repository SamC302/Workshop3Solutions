package com.team4099.workshop3;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static int sigma(int number){
        // Write a function using a for loop that takes a number and returns
        // the sum of the numbers from 1 to it
        // Ex. If given 3, the function should return 6 because 3 + 2 + 1 = 6
        int ans = 0;
        for(int i = 1; i < number+1;i++){
            ans = ans + i;
        }
        return ans;
    }

    public static int zero(int rate, int yIntercept){
        // Write a function using a while loop that takes a rate (assumed to be negative) and a y intercept
        // and return the least x-value where the function is negative
        // Ex. If given 2 and 4, the function should return 2
        // Ex. If given 9 and 2, the function should return 5
        int count = 0;
        while(yIntercept > 0) {
            yIntercept = yIntercept - rate;
            count++;
        }
        return count;
    }

    public static int log(int number,int base){
        // Write a function using a while loop that takes a number and a base
        // and returns the log of the number with the given base
        // Ex. If given 4 and 2, return 2. 
        int count = 0;
        while(number > 1){
            number = number/base;
            count++;
        }
        return count;

    }

    public static List<Integer> arrayAdd(List<Integer> arr, int addNum){
        // Write a function using a for each loop that takes an array and number
        // and returns an array that is the original array but with addNum added to each element
        // Ex. If given [1,2] and 2, return [3,4]. 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int n: arr){
            ans.add(n+ addNum);
        }
        return ans;

    }

}