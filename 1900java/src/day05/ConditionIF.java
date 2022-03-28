package day05;

import java.util.Scanner;

public class ConditionIF {
    public static void main(String[] args) {
        System.out.println("조건문이 시작하기전!!");
        if (11 < 10) {
            System.out.println("if문 안의 출력문 1");
            System.out.println("if문 안의 출력문 2");
        } else {
            System.out.println("else문 안의 출력문1");
            System.out.println("else문 안의 출력문2");
        }
        System.out.println("조건문이 종료하고 나서!!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 한 개를 입력해주세요 : ");

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        }
    }
}
