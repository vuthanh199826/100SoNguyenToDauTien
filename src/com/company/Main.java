package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        while (n < 100) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(n);
            }
            n++;
        }

    }
}
