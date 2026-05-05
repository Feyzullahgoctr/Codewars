import java.util.Arrays;
import java.util.Collections;

public class TargetArray {

    public static int[] twoSum(int[] numbers, int target) {

        int[] indexs = new int[2];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {

                    indexs[0] = i;
                    indexs[1] = j;
                    break;
                }
            }
            if (indexs.length == 2 && indexs[0] != 0 ) {
                break;
            }
        }

        Arrays.sort(indexs);

        return indexs; // Do your magic!
    }

    public static void main(String[] args) {

        int[] index = twoSum(new int[]{2,2,3},          4);

        for (int i : index) {
            System.out.println(i);
        }

    }

}
