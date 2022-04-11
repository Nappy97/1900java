package day10;

public class ClassRoom {
    public String className;
    public String teacher;
    public String[] students;

    //기본 생성자
    public ClassRoom() {
        this.className = "";
        this.teacher = "";
        this.students = new String[3]; //String 배열 초기화
    }

    //초기화 생성자
    public ClassRoom(String className, String teacher, String[] students) {
        this.className = className;
        this.teacher = teacher;
        this.students = students;
    }

    //출력하기 메소드
    public void printClassName() {
        System.out.println("우리 학과명 : " + this.className);
    }

    public void printTeacher() {
        System.out.println("우리반 선생님 : " + this.teacher);
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생명 : " + this.students[i]);
        }
    }

    //setter 메소드
    public void setClassName(String className) {
        this.className = className;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setStudents(int index, String name) {
        this.students[index] = name;
    }

    //getter 메소드
    public String getClassName() {
        return this.className;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public String getStudents(int index) {
        return this.students[index];
    }
}
