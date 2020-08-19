package programsBasedOnMaths;

import java.util.Scanner;

public class countDigitOfaNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nod=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        System.out.println(nod);
    }
}
