public class test {
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++) {
            print(i);
        }
    }

    private static void print(int i) {
        int b = 10;
        int a = 100;

        int result = switch (i) {
            case 1 -> {
                System.out.println("case 1");
                yield 1;
            }
            case 2 -> a * b;
            case 3 -> 3;
            default -> 
                throw new IllegalArgumentException("value:" + i);
        };
        System.out.println(result);
    }
}

