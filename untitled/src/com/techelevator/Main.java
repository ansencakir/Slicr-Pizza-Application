package com.techelevator;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        public class Main {
            public static float SimpleInterest(int P, int R, int T) {

                //this is default OUTPUT. You can change it.
                BigDecimal SI = new BigDecimal(0.00);

                //write your Logic here:
                SI = BigDecimal.valueOf((P * R * T)/100);
                SI.setScale(2);

                return SI;
            }
            public static void main(String[] args) {
                //INPUT [uncomment & modify if required]
                Scanner sc=new Scanner(System.in);
                int P=sc.nextInt();
                int R=sc.nextInt();
                int T=sc.nextInt();

                //OUTPUT [uncomment & modify if required]
                System.out.print(SimpleInterest(P,R,T));
                sc.close();
            }

        }
    }
}
