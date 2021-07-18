package com.deepti;
import java.util.*;
public class Deepti {
    public static void main(String[] args) {
        int a, b, c, d, e;

        Scanner ref = new Scanner(System.in);
        //User se value lene ke liye bnaya
        System.out.println("Enter The first number");
        a = ref.nextInt();
        System.out.println("Enter The Second number");
        b = ref.nextInt();
        System.out.println("Enter The third number");
        c = ref.nextInt();
        System.out.println("Enter The fourth number");
        d = ref.nextInt();
        System.out.println("Enter The fifth number");
        e = ref.nextInt();

        if(a > b && a > c){
            System.out.println("largest number is:"+a);
        }
        else if(b > c && b > d){
            System.out.println("largest number is:"+b);
        }
        else if(d > e) {
            System.out.println("largest number is:" + d);
        }
        else{
            System.out.println("largest number is:"+e);
        }
    }
}


