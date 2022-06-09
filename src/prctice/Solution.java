package prctice;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {

    //Initialize array
    int [] arr ={25, 11, 7, 75, 56,1};
    //Initialize max with first element of array.
    int max = arr[0];
    int k=0;
    //Loop through the array
    for (int i = 0; i < arr.length; i++) {
        //Compare elements of array with max
        if(arr[i] > max)
            max = arr[i];
    }
    System.out.println("Largest element present in given array: " + max);
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]!= 75) {
            System.out.println(" array: " + arr[i]);
            arr[i] = 75;
        }
        else {
            break;
        }
    }
    arr[arr.length-1]=0;
    for(int j=0;j< arr.length;j++) {
        System.out.print(" " + arr[j]);
    }

    }
}