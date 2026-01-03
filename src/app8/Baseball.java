package app8;

public class Baseball extends Club{
    public Baseball(String name) {
        super(name);
    }

    public void practice() {
        System.out.println("キャッチボール");
        System.out.println("バッティング");
        System.out.println("筋トレ");
    }
}
