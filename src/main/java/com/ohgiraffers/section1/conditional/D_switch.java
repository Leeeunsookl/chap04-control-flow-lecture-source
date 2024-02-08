package com.ohgiraffers.section1.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement(){

        /* 수업목표. switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [ switch 문 표현식]
        *   switch(비교할 변수){
        *       case 비교값1 : 비교값1 과 일치하는 경우 실행할 구문; break;
        *       case 비교값2 : 비교값2 와 일치하는 경우 실행할 구문; break;
        *       default : case에 모두 해당하지 않는 경우 실행할 구문; break;
        *   }
        *   */

        /* 필기.
        *   여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *   if - else - if와 유사하다.
        *   따라서 일부 호환이 가능하다.
        *   하지만, switch 문으로 비교 가능한 값은 정수, 문자, 문자열의 형태이다.
        *   실수와 논리는 비교할 수 없다.
        *   또한 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할 수 없다는 게
        *   차이점이다.
        *   */

        /* 필기.
        *   정수 두 개와 연산 기호 문자를 입력 받아서
        *   두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
        *   */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first =sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second=sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op=sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 생성 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연산의 결과가 달라짐 */
        switch (op){
            case '+' :
                result = first + second;
                break;
            case'-' :
                result = first - second;
                break;
            case'*' :
                result = first * second;
                break;
            case'/' :
                result = first * second;
                break;
            case'%' :
                result = first % second;
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " +result);
    }

    public void testSwitchVendingMachine(){

        /* 수업목표. switch 문 내의 break 문에 대해 흐름을 이해하고 적용할 수 있다. */
        /* 필기. switch 문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */

        /* 필기. switch 문을 이용한 간단한 자판기 만들어보기 */
        System.out.println("===========HiMedia 자판기===========");
        System.out.println("탐스 비타500 제로콜라 단백질초코 아메리카노");
        System.out.println("===================================");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc= new Scanner(System.in);
        String selectDrink = sc.nextLine();

        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;

        switch (selectDrink){

            case "탐스" :
                System.out.println("탐스를 선택했습니다");
                price=900;
                break;

            case "비타500" :
                System.out.println("비타500를 선택했습니다");
                price= 1200;
                break;

            case "제로콜라" :
                System.out.println("제로콜라를 선택했습니다");
                price= 1800;
                break;

            case "단백질초코" :
                System.out.println("단백질 초코를 왜 선택했어요?");
                price= 2800;
                break;
//                break는 해당구문 까지만 하고 멈추겠다는 것이고, 그게 없으면
//                음료를 선택해주세요 : 단백질초코
//                단백질 초코를 왜 선택했어요?
//                아메리카노를 드신다구요?
//                2500원을 투입해주세요 라고 출력이 된다.

            case "아메리카노" :
                System.out.println("아메리카노를 드신다구요?");
                price= 2500;
                break;
        }

        System.out.println(price +"원을 투입해주세요");

    }

}
