
public class RecursionLoops {
    static void forLoop(int start, int limit, int increment) {
        System.out.println(start);
        if (start >= limit - increment) return;
        forLoop(start + increment, limit, increment);
    }

    static void whileLoop(int n, int max) {
        if (max == n) {
            return;
        }
        System.out.println(n);
        whileLoop(n + 1, max);

    }

    static void doWhile(int n, int max) {
        System.out.println(n);
        if (max == n) {
            return;
        }
        whileLoop(n + 1, max);
    }

    static int power(int number, int power) {
        if (power <= 0) return 1;
        return number * power(number, power - 1);

    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if (n<2) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
//        forLoop(0,100, 3);
//        whileLoop(0, 10);
//        doWhile(0, 10);
        System.out.println(fibonacci(10));

        System.out.println(power(10, 3));
        System.out.println(factorial(6));

    }


}
