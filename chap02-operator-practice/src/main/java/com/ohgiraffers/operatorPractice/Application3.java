package com.ohgiraffers.operatorPractice;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("성벽을 입력해주세요 (F/M) : ");
            String gender = sc.nextLine();
            String result = (gender.equals("M")) ? "남자입니다." : "여성입니다.";

            System.out.println(result);
        } while (true);
    }
}

            /*
             * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
             * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
             *
             * M
             *
             * ---- 출력 결과 ---
             * 남자입니다.
             * */
