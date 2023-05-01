/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author USER
 */
public class Week2 {

    public static int[] selectionsort(int[] array)
    {        
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i]>array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j]=tmp;
                }
            }
        }
        
        return array;
    }
    
    public static int[] bubblesort(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1]<array[j]) {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j]=tmp;
                }
            }
        }
        return array;
    }
    
    public static int[] combSort(int[] array) {
        int n = array.length;
        int gap = n; // gap: mesafe
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (array[i] > array[i + gap]) {
                    // swap arr[i] and arr[i+gap]
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    swapped = true;
                }
            }
        }
        
        return array;
    }

    // Calculate the next gap value
    private static int getNextGap(int gap) {
    // Shrink gap by a factor of 1.3
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }
    
    public static int[] insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int var = array[i];
            int j = i-1;
            while(j>-1 && array[j]>var) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = var;
        }
        
        return array;
    }
    
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int[] array1 = {5,3,1,12,8,6,7};
        System.out.println("Sorting Ã¶ncesi: ");
        printarray(array1);
        int[] sorted1 =selectionsort(array1);
        System.out.println("Sorting sonrasÄ±: ");
        printarray(sorted1);        
        
        int[] array2 = {15,3,1,12,5,8,7};
        System.out.println("Sorting Ã¶ncesi: ");
        printarray(array2);
        int[] sorted2 =bubblesort(array2);
        System.out.println("Sorting sonrasÄ±: ");
        printarray(sorted2);
        
        int[] array3 = {23,42,12,16,1,8,7};
        System.out.println("Sorting Ã¶ncesi: ");
        printarray(array3);
        int[] sorted3 =insertionsort(array3);
        System.out.println("Sorting sonrasÄ±: ");
        printarray(sorted3);        
            
    }
    
}
