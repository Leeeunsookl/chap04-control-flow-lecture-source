package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class P_1 {

    public void problem1() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public void problem2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /* 구구단 7단을 출력하는 프로그램 */
    public void problem3() {
        int ac = 7;

        for (int i = 1; i <= 9; i++) {
            System.out.println("7" + "*" + i + "=" + (ac * i));
        }
        System.out.println();

    }

    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
    public void problem4() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
     *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
     *  */
    public void problem5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼 숫자 : ");
        int x = sc.nextInt();
        int sum = 1;
        for (;x>0;x--) {    //x>0  아니니까 루프 끝나고 다음 단락 문장 프린트
            //5!
            sum*=x; // 1*5*4*3*2*1
        }
        System.out.print("답: " + sum);

    }

    /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */
    public void problem6(){
        for(int time=0; time<=1439;time++ ){

            int hour=time/60;
            int minute=time%60; //시간으로 0.~~시간 이므로 60을 곱한 분이 나온다

            System.out.println(hour+"시" + minute + "분");

        }

    }
    /* 별 만들기 게임
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */

    public void problem7(){

        for(int i=1; i<=5 ; i++){
            for (int j = 1;  j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    /* 별 만들기 게임
     *      *
     *     ***
     *    *****
     *   *******
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void problem8() {
        for (int i = 1; i <= 9; i += 2) {       //첫번째 줄은 "줄"을 결정해준다
            for (int j =9; j > i; j-=2) {       //2번째는 빈공간
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){       //별을 몇개 붙일지
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void problem9(){
        Scanner sc=new Scanner(System.in);
        System.out.print("몇 줄 할거니?");
        int row= sc.nextInt();

        for(int i =1; i<=row;i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
        for(int z=1; z<= i;z++){
            System.out.print("*");
        }
            System.out.println();
        }

    }

    }



//i=1, 줄은 3줄 1<=3
//빈칸2
//별갯수 2*1-1=1 1
//2 줄은 3줄 2<=3
//빈칸1
//4-1=3
//i=3,