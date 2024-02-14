package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        /* 수업목표. continue 문 사요에 대한 흐름을 이해하고 적용 */
        /* 필기.
        *   continue 문은 반복문 내에서 사용
        *   해당 반복문의 회차를 중간에 멈추고 다시 증감식으로 넘어가게 함
        *   일반적으로 if(조건식){continue; }처럼 사용된다.
        *   보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용됨
        *   */

        /* 필기. 1~100사이 4의 배수이면서, 5의 배수인 값 출력 */

        for(int i=1; i<=100; i++){

            if(i%4==0 && i%5==0){
                /* 필기. i값이 4와 5의 공배수인 경우 i 출력 */
                System.out.println(i);
            }
            else {
                /* 필기. 공배수가 아닌 경우 증감식으로 넘어감 */
                continue;

            }

        }

    }
    public void testSimpleContinueStatement2(){
        /* 필기.
        *   구구단 2~9까지 출력
        *   각 단의 수가 짝수인 경우 출력을 생략
        *   */

        for(int dan=2; dan<10; dan++ ){
            for(int su = 1; su <10; su++){

                if(su%2 == 0){      //2,4,6,8은 곱하지말게끔, 수가 짝수라면 위로 안가고 증감식 이어서
//                    break;//만족 안하면 위로 안올라가고 아래로 바로 내려가서 2~9까지 *1 한 값이 나와버린다
                    continue;
                }

                System.out.println(dan+"*"+su+"="+(dan*su));
            }
        }
        System.out.println();

    }

}
