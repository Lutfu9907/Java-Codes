/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author dolay
 */
public class binarysearch {

    public static void main(String[] args) {
       int [] dizi={1,3,5,7,9};
       int index=binarysearch(dizi,7);
        System.out.println("index "+index);
       
    }
    
    public static int binarysearch(int array[],int element){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            
            if (array[mid]==element){
                return mid;
        }
            else if (array[mid]<element){
                low=mid+1;
            }
            else if(array[mid]>element){
                high=mid-1;
            
                
            }
        }
        return -1;
    }
}
