package app;

class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student("菅原");
        stu1.setScore(80);
        stu1.display();

        Student stu2 = new Student("村山");
        stu2.setScore(-50);
        stu2.display();
    }
}
