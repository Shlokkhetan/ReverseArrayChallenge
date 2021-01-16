package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
//        System.out.println(array.length);
        reverse(array);
        System.out.println(Arrays.toString(array));
	// write your code here
    }
    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfIndex = array.length/2;

        for(int i = 0; i<halfIndex;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }


//        int temp = 0;
//        int[] reverse = new int[array.length];
//        for(int i = array.length-1;i>=0;i--){
//            for(int j = 0;j<reverse.length;j++){
//                reverse[j]= array[i];
//            }
//
//        }
//        System.out.println(Arrays.toString(reverse));

    }
}
