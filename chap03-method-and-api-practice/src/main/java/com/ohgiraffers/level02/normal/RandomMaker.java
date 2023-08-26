package com.ohgiraffers.level02.normal;

public class RandomMaker {

    public static void rockPaperScissors(){
        int random = 0;
        random = (int)(Math.random() * 3)+ 1;
        switch (random) {
            case 1 :
                System.out.println("가위!!"); break;
            case 2:
                System.out.println("바위!"); break;
            case 3:
                System.out.println("보!!");break;
        }
            
        }
    public static void tossCoin(){
        int random = (int)(Math.random() * 2)+1;
        switch(random){
            case 1:
                System.out.println("뒷면");break;
            case 2:
                System.out.println("앞면");break;
        }
    }
    }
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
