import java.util.*;
public class Main {
    public static void main(String args[]){
       
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       int[] arr=new int[5];
       System.out.println("Enter the elements of the array: ");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
