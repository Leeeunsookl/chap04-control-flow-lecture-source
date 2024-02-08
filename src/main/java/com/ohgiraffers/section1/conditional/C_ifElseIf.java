package com.ohgiraffers.section1.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement(){

        /* 수업목표. If-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [if - else - if문 표현식]
        *   if(조건식1) {
        *       조건식1이 true 일 때 실행할 명령문;
        *   } else if {
        *       조건식1이 false 이고, 조건식 2가 true 일 때 실행할 명령문;
        *   } else {
        *       위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
        *   }
        *   */

        /* 필기.
        *   if-else-if 문은 조건식1의 결과값이 참(true) 이면 if{ } 안에 있는 코드 실행.
        *   조건식 1이 false이면 조건식2를 확인하여 참(true) 이면 else if{ } 안에 있는 코드 실행.
        *   조건식 1과 조건식2의 결과 값이 모두 거짓(false)이면 else{} 안에 있는 코드 실행.
        *   */

        //여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행시키고 싶은 경우 사용

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨렸다.");
        System.out.println("나무꾼이 어쩔 줄 몰라하면 그 때...");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");

        System.out.print("어느 도끼가 너의 도끼이느냐? 1.금도끼 2.은도끼 3.쇠도끼 : ");

        Scanner sc= new Scanner(System.in);
        int answer = sc.nextInt();


        if (answer == 1){
            System.out.println("거짓말! 욕심쟁이인 너에게는 아무것도 주지 않겠다. ");
        } else if (answer==2){
            System.out.println("거짓말! 욕심은 과하지 않으나 거짓말을 용서 못한다. ");
        } else if (answer==3){
            System.out.println("정직하구나. ");
        } else
            System.out.println("그런 숫자는 없다. ");

        System.out.println("그렇게 산신령은 연못 속으로 사라졌다.");



    }

}
