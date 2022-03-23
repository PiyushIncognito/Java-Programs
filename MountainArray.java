package com.company;


//Mountain Array is also known as Bitonic Array
//eg. arr = {1,2,3,5,7,6,3,2}  increase and then decreases

// Q. Find peak in mountain array

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexinMountainArray(arr));
    }
    public static int peakIndexinMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-1)/2;

            if (arr[mid] > arr[mid+1]){
                //you are in decreasing part of an array
                //that is why look in left part of an array
                end = mid;
            } else{
                //you are in ascending part of an arrays
                start = mid + 1;
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 check above
        return start; //return start or end bcoz both are equal at the end
    }

}
