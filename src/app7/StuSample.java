package app7;

public class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student("梶原", 23);
        Person psn = stu1;
        psn.display();
        // psn.chgStuNo(1001);

        if(psn instanceof Student) {
            Student stu2 = (Student)psn;
            stu2.chgStuNo(1001);
            stu2.display();
        }

        stu1.display();
    }
}
