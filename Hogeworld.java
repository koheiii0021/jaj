public class Hogeworld {
    public static void main(String[] args) {
        String str = "hoge, world.";
        hello(str);
        System.out.println(str);
    }

    private static String hello(String msg) {
        return msg.replaceAll("hoge", "hello");
    }
}
