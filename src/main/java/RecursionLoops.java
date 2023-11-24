
public class RecursionLoops {
    static void forLoop(int start, int limit, int increment ){
        System.out.println(start);
        if(start>=limit-increment) return;
        forLoop(start+increment, limit, increment);
    }

    static void whileLoop(int n, int max){
        if (max==n) {
            return;
        }
        System.out.println(n);
        whileLoop(n+1, max);

    }

    static void doWhile(){


    }

    public static void main(String[] args) {
       forLoop(0,100, 3);
       whileLoop(0, 10);
    }

}
