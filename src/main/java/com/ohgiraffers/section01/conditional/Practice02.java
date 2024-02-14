package com.ohgiraffers.section01.conditional;

public class Practice02 {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        char c='A';

        System.out.println('c'<='Z');
        System.out.println(y>= 5|| x<0 && x>2);
        System.out.println(y +=10 - x++);   //13,3
        System.out.println(x+=2);       //5
        System.out.println(!('A'<= c && c<= 'Z'));      //&& true이므로 !는 false
//        System.out.println('A'<=c);
//        System.out.println(c<='Z');
        System.out.println('C'-c);      //c='A'
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);        //c++은 c는 그대로 그다음 다 끝나고 c값이 변한다.
        System.out.println(c);

        System.out.println("===============================");
        int numOfApples= 92;
        int sizeOfBucket =10;

        System.out.println(numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket)>0? 1:0);
        int numOfBucket=(numOfApples/sizeOfBucket)+1;

        System.out.println("===============================");
        int num =456;
        System.out.println(num-(num%100));

        int num33=333;
        System.out.println(num33-num33%10+1);

        int num77=777;
        System.out.println(num77-num77%10+1);

    }
    //&& : and , ||: or

}
