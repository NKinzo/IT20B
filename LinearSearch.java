/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT20B;

public class LinearSearch {
    
    public static int search(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        
       int arr[] = { 20, 30, 50, 40, 60 };
       
       int result = search(arr , 30);
       if (result >=0) {
                   System.out.println("Target Found at Index: " + result + " = " + arr[result]);
       }else{
           System.out.println("Element not found");
       }
    }
    
}
