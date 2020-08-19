package programsBasedOnMaths;

import java.util.Scanner;

public class PythogoreanTripplets {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int p=scn.nextInt();
        int b=scn.nextInt();
        int h=scn.nextInt();
        int max=p;
        if(b>=max){
            max=b;
        }
        else if(h>=max){
            max=h;
        }

        if(max==p){
            boolean flag=((b*b+h*h)==(p*p));
            System.out.println(flag);
        }
        else if(max==b){
//            do something
            boolean flag=((p*p+h*h)==(b*b));
            System.out.println(flag);
        }
        else {
            // do some thing;
            boolean flag=((b*b+p*p)==(h*h));
            System.out.println(flag);
        }
    }


}
