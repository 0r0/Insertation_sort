package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] unsortedArray={11,3,23,1,6,4,3,2,77};
       double[] sortedArray=InsertationSort.done(unsortedArray);
        Arrays.stream(sortedArray).forEach(System.out::print);
    }
}
