package week4;
public class Example2 {

    
    public static void main(String[] args) {
        int[] dizi = {1,3,5,11,15,19,23,25};
        int index = binarysearch(dizi,23,0,dizi.length-1);
        System.out.println("Aranan eleman indeksi: "+index);
    }
    
    public static int binarysearch(int[] array, int x, int low, int high) {
        if(high>low) {
            int middle = (low + high) / 2;
            if(x == array[middle]){ // base case
                return middle; 
            }
            else if (x > array[middle]) {
                int updated_low = middle + 1;
                return binarysearch(array,x,updated_low,high);
            }
            else if (x < array[middle]) {
                int updated_high = middle - 1;
                return binarysearch(array,x,low,updated_high);
            }
        }
        return -1;
    }

    
}
