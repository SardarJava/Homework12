package com.company;

public class Triangle {
        int a;
        int b;
        int c;
        int u;


        void area () {
            u = a * b * c / 2;
            System.out.println(Math.sqrt(u*(u-a)*(u-b)*(u-c)));
        }


    }
