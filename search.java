package com.company;


public class search{
    public static void main(String[] args) {
        //For Integer Array
        int[] nums = {25,45,13,18,98,55,66,74};
        int target = 25;
        boolean ans = linearSearch(nums,target);
        System.out.println(ans);
        //For String Array
        String name = "Piyush";
        char tar = 'u';
        System.out.println(stringsearch(name,tar));
        
    }
    //For Integer Array
    static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return true;
            }
        }
        return false;
    }
    //For String Array
    static boolean stringsearch(String str, char tar){
        if(str.length()== 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(tar == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
