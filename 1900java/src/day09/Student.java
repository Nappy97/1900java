package day09;

public class Student {
    String name = "홍길동";
    int eng = 80;
    int kor = 100;

    Student() {
        name = "";
        eng = 0;
        kor = 0;
    }

    Student(String a, int b, int c) {
        name = a;
        eng = b;
        kor = c;
    }

    public void printName() {
        System.out.println("제 이름은 " + name + "입니다.");
    }

    public void printScore() {
        System.out.println("영어 점수는 " + eng + "입니다.");
        System.out.println("국어 점수는 " + kor + "입니다.");
    }

    public void printInfo() {
        int total = eng + kor;
        System.out.println("제 이름은 " + name + "이고, 점수는 " + total + "점 입니다.");
    }

    public int getTotal() {
        return eng + kor;
    }


}
