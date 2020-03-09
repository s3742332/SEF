package main.java;

import org.w3c.dom.ls.LSOutput;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {6,63,42,12,9};
        int n = a.length;
        int dummy;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]){
                    dummy = a[j];
                    a[j] = a[j+1];
                    a[j+1] = dummy;
                }
            }
        }


        int p = 0;
        while (p < a.length){
            System.out.print(a[p] + " ");
            p++;
        }
    }

        public void sort(int[] array){
        int dummy;
        int length = array.length;
            for (int counter = 0; counter < counter-1; counter++){
                for (int j = 0; j < length-counter-1; j++){
                    if (array[j] > array[j+1]){
                        dummy = array[j];
                        array[j] = array[j+1];
                        array[j+1] = dummy;
                    }
                }
            }
            int c = 0;
            while (c < array.length){
                System.out.print(array[c] + " ");
                c++;
            }
        }

    }


