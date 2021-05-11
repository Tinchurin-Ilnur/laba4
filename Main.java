package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
    System.out.println("n");
        double n=in.nextDouble();
    System.out.println("a") ;
        double a=in.nextDouble();
    System.out.println("m");
        double m =in.nextDouble();
    System.out.println("s");
        double s=in.nextDouble();
    System.out.println("s1");
        double s1=in.nextDouble();
 double p=0;
           for (int i = 1; i <= n; i++){
               s = a - i * n;
               s1 = s1 + s;
               p = a*(a-n)*(a-2*n);
        }
        System.out.println(p);
    }
}
