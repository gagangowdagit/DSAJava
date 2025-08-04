package BubbleSort;

import java.util.Scanner;

public class Bubsort {
    public static void Bubsorting(int arr[], int n ){
        System.out.println("BubbleShort");
        for(int i=0;i<n-1;i++){
          for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
          }
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
        Bubsorting(arr,n);
        System.out.println("sorted elements are");
        for(int num : arr){
            System.out.print(num);
        }
        sc.close();

    }
}
