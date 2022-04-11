package day10;

public class ClassRoomTest {
    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();

        cr.setClassName("컴퓨터 공학과");
        cr.setTeacher("이순신");
        cr.setStudents(0, "홍길동");
        cr.setStudents(1, "김유신");
        cr.setStudents(2, "강감찬");

        System.out.println("========================");

        System.out.println("학과명 : " + cr.getClassName());
        System.out.println("선생님 : " + cr.getTeacher());
        System.out.println("1번학생 : " + cr.getStudents(0));

        System.out.println("===========================");

        String[] students = new String[]{"이순신", "김유신", "홍길동"};
        ClassRoom clsroom = new ClassRoom("컴퓨터 공학과", "김말순", students);

        clsroom.printClassName();
        clsroom.printTeacher();
        clsroom.printStudents();

    }
}
