package programsBasedOnMaths;

import java.util.Scanner;

public class allPrime {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
         int n=scn.nextInt();
         if(n>0 && n<=2){
             System.out.println("Nmber is not prime ");
         }
         for(int i=2;i<=n;i++){
             int count =0;
             for(int j=2;j*j<=i;j++){
                 if(i%j==0){
                     count++;
                 }
                 if(count==0){
                     System.out.println(i);
                 }
             }
         }

    }
}
