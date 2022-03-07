package com.company;

import java.util.Arrays;

public class PassingInFunction {
    //Mutable means you can change the object
    //Strings are immutable in Java
    //Integers are mutable in Java

    public static void main(String[] args) {
        int[] arr = {12, 22, 56, 75};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[1] = 45;
    }
}
