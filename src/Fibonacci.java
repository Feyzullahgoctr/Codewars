public class Fibonacci {

    public static long[] productFib(long prod) {
        // your code
        long a = 0;
        long b = 1;

        while (a * b < prod) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        if (a * b == prod) {
            return new long[]{a, b, 1};
        } else {
            return new long[]{a, b, 0};
        }

    }

    public static void main(String[] args) {

        long[] test = productFib(4896);

        for (long t : test) {
            System.out.println(t);
        }

    }

}
