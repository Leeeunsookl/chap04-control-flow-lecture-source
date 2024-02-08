package com.ohgiraffers.section1.conditional;

import java.util.Scanner;

public class D_if {

    public void test1 (){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자 하나를 입력하시오.");
        int test1 = sc.nextInt();
        if(test1!=0) {
            if (test1 > 0) {
                System.out.println("양수다.");
            } else {
                System.out.println( "음수다. ");
            }
        }
    }

    public void test2 (){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오.");
        int test2 = sc.nextInt();
        if(test2 % 2 ==0){
            System.out.println("짝수다.");
    } else{
            System.out.println("홀수다.");
        }
    }

    public void test3(){
        Scanner sc= new Scanner(System.in);
        System.out.print("숫자를 입력하시오.");
        int input=sc.nextInt();
        if (input>1) {
            if (input < 10) {
                if (input % 2 == 0) {
                    System.out.println("짝수다.");
                }
                if (input % 2 != 0) {
                    System.out.println("홀수다.");
                }
            }
            else System.out.println("반드시 1~10 사이의 정수를 입력해야 한다.");
        }
        }
    }

