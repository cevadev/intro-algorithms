package com.ceva.intro.algo.ch02;

public class InsertionSortSample {
    private int[] array = {31,41,59,26,41,58};

    private void makeInsertionSortAsc(){
        int key;
        int j;
        for(int i = 1; i < array.length; i++){
            // sub arreglo array[1] hasta array[i-1]
            key = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > key){
                // movemos los valores del arreglo una posicion a la derecha
                array[j + 1] = array[j];
                j = j-1;
            }
            // movemos key a la izquierda para ordenarla
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSortSample iSort = new InsertionSortSample();
        iSort.makeInsertionSortAsc();
        for (Integer i : iSort.array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
