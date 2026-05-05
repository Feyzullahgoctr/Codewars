
import java.util.Arrays;

public class FindOdd {

    public static int findIt(int[] a) {

        boolean[] flag = new boolean[a.length];  // Alle værdier er false i starten
        Arrays.fill(flag, true);             // Det konverter alle værdier som true

        int result = 0;
        int maxIndexCount = 0;

        for (int i = 0; i < a.length; i++) {
            int indexCount = 0;
            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j] && flag[j]) {
                    indexCount++;
                    flag[j] = false;
                }

            }
            if (indexCount > maxIndexCount && indexCount % 2 == 1) {
                result = a[i];
                maxIndexCount = indexCount;
            }

        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

}
