package day09;

public class CastingExam {
    public static void main(String[] args) {
        int num = Integer.parseInt("10");
        System.out.println(num);

        double pi = Double.parseDouble("3.14159");
        System.out.println(pi);

        System.out.println("10" + "3.14159");
        System.out.println(num + pi);

        String a = Integer.toString(num);

        String b = Double.toString(pi);

        String c = 1234 + "";
        String d = num + "";
        System.out.println(d);
    }
}
