import java.io.*;
import java.util.*;


public class FirstSecondThirdLargest {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    int d=0;
    for(int i=0; i < n; i++){
        arr[i] = in.nextInt();
        d++;
    }


        for(int k=(n-1);k>=0;k--){
            System.out.print(arr[k]);
            System.out.print(" ");

    }
    in.close();
}
    }
        
       