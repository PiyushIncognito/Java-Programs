package com.company;

public class MiniNumber {
    public static void main(String[] args) {
        int[] arr = {118,12,-7,45,75,22,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i< arr.length;i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }return ans;
    }
}
