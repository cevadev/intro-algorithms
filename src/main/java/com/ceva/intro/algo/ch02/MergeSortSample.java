package com.ceva.intro.algo.ch02;

import java.util.Arrays;

public class MergeSortSample {
    private int[] array = {2,4,6,7,1,2,3,5};
    private int[] left;
    private int[] right;

    private void makeMergeSort(int[] array){
        if(array.length > 1){
            int middle = array.length / 2;
            left = Arrays.copyOfRange(array, 0, middle);
            right = Arrays.copyOfRange(array, middle, array.length);

            // makeMergeSort(left);
            // makeMergeSort(right);

            int i = 0; // elemento mas pequeno del array left
            int j = 0; // elemento mas pequeno del array right
            int k = 0; //

            while(i < left.length && j < right.length){
                if(left[i] <= right[j]){
                    array[k] = left[i];
                    i++;
                }else{
                    array[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length){
                array[k] = left[i];
                k++;
                i++;
            }

            while(j < right.length){
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }

    private void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortSample ms = new MergeSortSample();
        ms.printArray(ms.array);
        ms.makeMergeSort(ms.array);
        ms.printArray(ms.array);
    }
}
