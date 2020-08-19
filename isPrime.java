package programsBasedOnMaths;

import java.util.Scanner;

public class isPrime {

        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int count=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    count++;
                }

            }
            if(count==0){
                System.out.println(n  + "is Prime");
            }
            else {
                System.out.println(n+ "+"+"is not Prime");
            }
        }
}
