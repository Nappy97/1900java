package day03;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sc.next();

        System.out.println("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.printf("%d\n", num);

        System.out.println("실수를 입력하세요 : ");
        double pi = sc.nextDouble();
        System.out.printf("%f\n",pi);

        System.out.println("프로그램이 종료되었습니다.");
    }

}
