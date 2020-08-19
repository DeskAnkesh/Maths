package programsBasedOnMaths;

import java.util.Scanner;

public class rotateAnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int temp=n;
        int nod=0;

        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=n+k;
        }
        int mul=1,div=1;
        for(int i=0;i<nod;i++){
            if(i<k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }

        }
        int rem=n%div;
        int left =n/div;
        int rotate =left+mul*rem;
        System.out.println(rotate);
    }

}
