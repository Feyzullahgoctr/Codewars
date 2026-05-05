import java.util.ArrayList;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        // Code here or

        String[] line = numbers.split(" ");

        int[] list = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            list[i] = Integer.parseInt(line[i].trim());
        }

        int maxNumber = list[0];
        int minNumber = list[0];
        for (int l : list) {
            if (l > maxNumber) {
                maxNumber = l;
            }

            if (l < minNumber) {
                minNumber = l;
            }
        }

        return maxNumber+ " " + minNumber;

    }


    public static void main(String[] args) {

        System.out.println(highAndLow("9 5 6 8 7 1 5 47 -2 -10 6"));

    }

}
