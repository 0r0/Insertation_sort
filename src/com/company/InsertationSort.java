package com.company;

public class InsertationSort {
    private InsertationSort(){

    }
    public static double[] done(double[] sortingArray){
        double key;
        int j;
        for(int i=1;i<sortingArray.length;++i){
            
            j=i-1;
            key=sortingArray[i];
            while(j>=0 && sortingArray[j]>key){
                sortingArray[j+1]=sortingArray[j];
                j--;
            }
            sortingArray[j+1]=key;
        }
        return sortingArray;
        
    }
}