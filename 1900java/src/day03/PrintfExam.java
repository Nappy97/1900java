package day03;

public class PrintfExam {
    public static void main(String[] args) {
        System.out.printf("%d", 10);
        System.out.println();

        double pi = 3.1415;
        System.out.printf("%f", pi);
        System.out.println();

        pi = 3.1415928;
        System.out.printf("%f", pi);
        System.out.println();

        System.out.printf("%.8f", pi);
        System.out.println();

        System.out.printf("%c", 'A');
//        System.out.printf("%c", "A");
        System.out.println();

        System.out.printf("%s\n", "A");
        System.out.printf("%s\n", "10");
        System.out.printf("%s\n", "Hello World!");

        System.out.println("----왼쪽 / 오른쪽 정리----");
        System.out.printf("%10d\n", 12);
        System.out.printf("%10d\n", 12345);
        System.out.printf("%3d\n", 12345);
        System.out.printf("[%10d]\n", 12345);
        System.out.printf("[%-10d]\n", 12345);
        System.out.printf("[%10s]\n", "Hello");
        System.out.printf("[%-10s]\n", "Hello");

        System.out.println("---- 빈자리 0으로 채우기 ----");
        System.out.printf("%010d\n", 10);
//        System.out.printf("%010c\n",'A');
//        System.out.printf("%010s\n","Hello");

        System.out.println("---- 여러개 형식 지정자 사용하기 ----");
        System.out.printf("%d, %f, %c, %s", 10, 3.14, 'A', "Hello");


        System.out.println("---- 영수증 ----\n");
        System.out.printf("탕수육 %10d원\n", 15000);
        System.out.printf("짜장면 %10d원\n", 5000);
        System.out.printf("짬봉 %10d원\n", 500);

        System.out.println("---- 영수증 ----\n");
        System.out.printf("탕수육\t%10d원\n", 15000);
        System.out.printf("짜장면\t%10d원\n", 5000);
        System.out.printf("짬봉\t%10d원\n", 500);

        System.err.println("123");
    }
}
