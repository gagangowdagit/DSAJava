package BinarySearch;
import java.util.*;

public class Binarysearch {
    public static int bins(int arr[], int n , int key){
        int beg = 0 ;
        int end = n-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>mid){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberof array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to insert");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        int indi = bins(arr,n,key);
        if(indi ==-1){
            System.out.println("Element are not found");
        }
        else{
            System.out.println("Elements are found at index: "+indi);
        }
        sc.close();

    }
}