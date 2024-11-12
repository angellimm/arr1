package com.example;

public class Main {
    public static void main(String[] args) {
        int[] array = HeapSort.randomArr();
        System.out.println("Array: ");
        HeapSort.printArray(array);

        HeapSort ob = new HeapSort();
        ob.sort(array);
        System.out.println("Array sorted: ");
        HeapSort.printArray(array);
    }
       
    }
