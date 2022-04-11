package day10;

class Overload {
    String name;
    int age;

    public Overload() {

    }

    public Overload(String name) {
        this.name = name;
    }

    public Overload(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println(this.name);
    }

    public void print(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(this.name);
        }
    }

    public void print(String prefix){
        System.out.println(prefix + " " + this.name);
    }

}

public class OverloadExam {
    public static void main(String[] args) {
        Overload ov = new Overload("홍길동");
//        ov.print();
//        ov.print(3);
        ov.print("전체학생");
    }
}
