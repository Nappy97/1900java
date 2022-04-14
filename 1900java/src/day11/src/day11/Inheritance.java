package day11.src.day11;

class Human{
    String type;

    public void print(){
        System.out.println("저는 인간입니다. 성별은 " + type + "입니다.");
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Student extends Human{
    public void print(){
        System.out.println("저는 학생입니다. 성별은 " + this.getType() + "입니다.");
    }
}

class Teacher extends Human{
    public void print(){
        System.out.println("저는 선생입니다. 성별은 " + this.getType() + "입니다.");
    }
}

class BossTeacher extends Teacher{}

class LeaderTeacher extends Teacher{}

public class Inheritance {

    public static void main(String[] args) {
//        Human hm = new Human();
//        hm.setType("남성");
//        System.out.println(hm.getType());
//
//        Human hw = new Human();
//        hw.setType("여성");
//        System.out.println(hw.getType());

        Student st = new Student();
        st.setType("여성");
        st.print();

        Teacher tc = new Teacher();
        tc.setType("남성");
        tc.print();

        BossTeacher bts =new BossTeacher();
        bts.setType("남성");


    }
}
