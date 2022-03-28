package day05;

import java.util.Scanner;

public class OperatorCondition {
    public static void main(String[] args) {
        System.out.println(true ? 10 : 20);
        System.out.println(false ? 10 : 20);

        Scanner sc = new Scanner(System.in);
        System.err.println("나이를 입력하세요");
        int age = sc.nextInt();

        System.out.println(age > 19 ? "성인" : "미성년자");
        System.out.println(age > 60 ? "노인" : "성인");
    }
}
