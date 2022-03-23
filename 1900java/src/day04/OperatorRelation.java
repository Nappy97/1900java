package day04;

import java.util.Scanner;

public class OperatorRelation {
    public static void main(String[] args) {
        System.out.println(10 > 5);
        System.out.println('a' > 5);
        System.out.println('a' > 'b');
        System.out.println();

        System.out.println(10 < 10);
        System.out.println(10 <= 5);
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();
        System.out.println(num>10);*/

        String id = "test";
        System.out.println(id == "test");
        System.out.println(id == "abc");

        System.out.println(id.equals("test"));
        System.out.println(id.equals("abc"));
    }
}
