package app8;

public class StuSample {
    public static void main(String[] args) {
        TandF taf = new TandF("陸上競技部");
        Football fb = new Football("サッカー部");
        Baseball bb = new Baseball("野球");
        Tabletennis tt = new Tabletennis("卓球");

        Student stu1 = new Student("梶谷", taf);
        stu1.display();
        stu1.practice();

        Student stu2 = new Student("桜井", fb);
        stu2.display();
        stu2.practice();

        Student stu3 = new Student("佐々木", bb);
        stu3.display();
        stu3.practice();

        Student stu4 = new Student("森", tt);
        stu4.display();
        stu4.practice();
    }
}
