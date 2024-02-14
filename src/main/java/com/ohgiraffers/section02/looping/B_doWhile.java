package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_doWhile {

    public void testDoWhileExample(){ //스캐너에서 처음 변수는 더하기는 0, 곱하기는 1, 스트링은 "" 공백으로 시작해주면 된다.

        // 키보드로 문자열 입력 받아 반복적 출력. exit 입력시 반복문 종료

        Scanner sc = new Scanner(System.in);
        String str = "";

        do{

            System.out.print("문자열을 입력하세요 : ");
            str=sc.nextLine();
            System.out.println(str);

            /* 필기. equals() : 문자열은 == 비교 불가능. */

        } while (!str. equals("exit"));

    }



}
