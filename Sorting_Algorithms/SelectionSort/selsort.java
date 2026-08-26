package SelectionSort;
import java.util.*;

public class selsort {
    public static void selsorting(int arr[], int n ){
        int min = 0;
        for(int i=0;i<n-1;i++){
            for(int k = i+1 ;k<n;k++){
                if(arr[k]<arr[min]){
                    min = k ; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;


        }
       
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
        selsorting(arr,n);
        System.out.println("sorted elements are");
        for(int num : arr){
            System.out.print(num);
        }
        sc.close();

    }
}