package day04;

public class OperatorPlus {
    public static void main(String[] args) {
        System.out.println(10 + 10);
        System.out.println(10 + 10.1);
        System.out.println(10 + 'a');

        System.out.println(10 + "Hello");
        System.out.println(10.1 + 10.9);
        System.out.println(10.123 + 'a');
        System.out.println(10.1 + "Hello");

        System.out.println('a' + "Hello");
        System.out.println();

        System.out.println('a' + 10);
        System.out.println('a' + 10.1);
        System.out.println('1' + 'a');
        System.out.println('a' + "Hello");
        System.err.println();

        System.out.println("Hello" + 10);
        System.out.println("Hello" + 10.9);
        System.out.println("Hello" + 'a');
        System.out.println("Hello" + "Hello");

        System.out.println(10 + "Hello" + 20);
        System.out.println(10 + 1 + "Hello" + 20);
        System.out.println(10 + (1 + "Hello") + 20);
    }
}
