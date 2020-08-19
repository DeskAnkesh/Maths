package programsBasedOnMaths;

import java.util.Scanner;

public class InverseOfaNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int inv=0,op=1;
        while (n!=0){
           int od= n%10;
           int id=op;
           int ip=od;
//           build inverse number using ip and id;
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;


        }
System.out.println(inv);
        

    }
}
