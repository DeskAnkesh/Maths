package programsBasedOnMaths;

import java.util.Scanner;

public class isFibo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c=1;
        if(n==a || n==b || n==c ){
            System.out.println(n+"is fibo");
        }
        boolean flag=false;
        for(int i=0;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            if(c==n){
                flag=true;
            }
        }
        if(flag){
            System.out.println("is fibo");
        }
        else{
            System.out.println("is not fibo");
        }

    }
}
