package day09;

import day09.Student;

public class StudentExam {
    public static void main(String[] args) {


//        st.name = "김유신";
//        st.eng = 100;
//        st.kor = 60;
        Student st = new Student("김유신", 100, 60);

        st.printName();
        st.printScore();
        st.printInfo();

        Student st1 = new Student("이순신", 90, 100);
//        st1.name = "이순신";
//        st1.eng = 90;
//        st1.kor = 100;

        st1.printInfo();


    }
}
