/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingalgorithms.java;
import java.util.Arrays;

public class SortingAlgorithmsJava {

    
    //Bubble sort 1. 
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } 
    
    //Selection sort ni dire 2.
    public static void selectionSort(int[] arr) {
     for (int i = 0; i < arr.length - 1; i++){
         
           int minIndex = i;
           for (int j = i + 1; j < arr.length; j++) {
             if (arr[j] < arr[minIndex]) {
                 minIndex = j;
               }
            }
           
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }   
    }
    
    //Last dayun Insertion Sort 3. 
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args){
        
        int[] originalArray = {45, 12, 78, 3, 56, 23, 89, 1, 34, 9};
      
        //creates copies, dire sya mag himo og separated nga kopya
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionArray));
    }
}