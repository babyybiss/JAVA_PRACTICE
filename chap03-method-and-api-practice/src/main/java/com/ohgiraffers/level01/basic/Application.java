package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application {


    /* 실행용 메소드 */
    public static void main(String[] args) {
       do {
           Scanner sc = new Scanner(System.in);

           System.out.println("두개의 정수를 띄워서 입력해주세요 : ");
           int a = sc.nextInt();
           int b = sc.nextInt();

           Calculator.sumTwoNumber(a, b);
           Calculator.multiTwoNumber(a, b);
       } while(true);

    }
    
}
