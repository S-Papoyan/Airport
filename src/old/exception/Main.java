package old.exception;

public class Main {
    public static void main(String[] args) {

        // System.out.println(sum(5, Integer.MAX_VALUE));
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }

    public static int fib(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        int[] array = new int[x];
        for (int i = 2; i < x; i++) {
            array[0] = 1;
            array[1] = 1;
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[x - 1];
    }
}


//    public static int sum(int x, int y) {
//        if (normal(x, y)) {
//            return x + y;
//        }
//        throw new RuntimeException("outOfBound");
//    }
//
//    public static boolean normal(int x, int y) {
//        int sum = x + y;
//        if ((x > 0 && y > 0) && sum < 0) {
//            return false;
//        }
//        if ((x < 0 && y < 0) && sum > 0) {
//            return false;
//        }
//        return true;
//    }
//}
