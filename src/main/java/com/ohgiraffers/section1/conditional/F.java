package com.ohgiraffers.section1.conditional;

import java.util.Scanner;

public class F {

    public void wgt(){
        Scanner sc= new Scanner(System.in);
        System.out.print("체중을 입력해주세요 : ");
        int wgt=sc.nextInt();
        System.out.print("치킨집이 열렸나? " + "true or false? ");
        boolean IsTrue =sc.nextBoolean();

        if(wgt>70) {
            System.out.println("샐러드를 먹겠어");
        }

        else if (IsTrue==true){
            System.out.println("치킨을 먹겠어");
        }
        else {
            System.out.println("라면을 먹겠어");
        }}

    }


