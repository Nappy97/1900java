package day04;

public class OperatorRest {
    public static void main(String[] args) {
        System.out.println(10 - 5);
        System.out.println(10 - 3.4);
        System.out.println(10 - 'a');
        System.out.println('b' - 'a');
        System.out.println();

        System.out.println(10 * 5);
        System.out.println(10 * 3.4);
        System.out.println(10 * 'a');
        System.out.println('a' * 'a');
//        System.out.println(10*"Hello");오류
        System.out.println();

        System.out.println(10 / 5);
        System.out.println(10 / 3.4);
        System.out.println(100 / 'a');
//        System.out.println(10 / "Hello");
        System.out.println(10 / 0);     //todo 나눌수 없음
        System.out.println();

        System.out.println(10%3);
        System.out.println(10%2);
        System.out.println(10%3.3);

        int var1 = 10;
        int var2 = 20;
        int var3 = 30;

        int result = var1 + var2 + var3;
        System.out.println(result);
    }
}
