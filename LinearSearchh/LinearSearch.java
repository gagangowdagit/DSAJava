package LinearSearchh;
import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numberof array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements to insert");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int se = sc.nextInt();
        boolean flag = true;
        int ind =0;
        if(arr.length==0){
            System.out.println("array is empty");
        }
        else{
            for(int c =0 ;c<arr.length;c++){
                if(arr[c]==se){
                    ind = c;
                    flag = true;
                    break;
                }
                else{
                    flag  = false;
                }
            }
        }
        if(flag ==true){
            System.out.println("ele found at"+ind);
        }
        else{
            System.out.println("element not found");
        }
        sc.close();

    }
}
