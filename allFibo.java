package programsBasedOnMaths;

import java.util.Scanner;

public class allFibo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        int c=1;
        System.out.println(c);
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            if(c>=n){
                break;
            }
            System.out.println(c);
        }
    }

}
