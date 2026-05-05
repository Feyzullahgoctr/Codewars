
public class FunnyNumber {

    public static long digPow(int n, int p) {
        // your code
        String number = String.valueOf(n);

        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int a = Integer.parseInt(String.valueOf(number.charAt(i)));
            result += Math.pow(a, p);
            p++;
        }

        if (result % n == 0) {
            return result / n;
        }

        return -1;
    }


    public static void main(String[] args) {

        System.out.println(digPow(89, 1));
        System.out.println(digPow(46288, 3));

    }

}
