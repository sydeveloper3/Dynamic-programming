package DynamicProgramming;

public class Fib {
    static int reccount = 0;
    static int memocount = 0;

    static int fib(int n)

    {
        reccount++;
        if (n == 0 || n == 1) {
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        int result = first + second;
        return result;
    }

    static int memoization(int n, int cache[]) {
        memocount++;

        if (n == 0 || n == 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        int first = memoization(n - 1, cache);
        int second = memoization(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int cache[] = new int[n + 1];
        memoization(n, cache);
        System.out.println(" memo result " + memoization(n, cache));

        System.out.println("fib result " + fib(n));
        System.out.println("rec count is :" + reccount);
        System.out.println("memo count is :" + memocount);

    }

}
