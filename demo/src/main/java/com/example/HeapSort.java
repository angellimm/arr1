package com.example;

import java.util.Random;

public class HeapSort {

     private static Random random = new Random();

    public static int[] randomArr(){

        int[] array = new int[random.nextInt(10, 16)];
        int n = array.length;
        for (int i=0; i<n; i++ ) {
            array[i] = random.nextInt(-99, 100);
        }
        return array;
    
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

     void heapify(int arr[], int n, int i) {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
   

    // Управляющая программа
   
    }
}
