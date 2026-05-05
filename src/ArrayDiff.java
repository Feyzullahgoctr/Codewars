public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here

        int index = 0;
        for(int i = 0; i < a.length; i++ ){
            for (int j = 0 ; j < b.length; j++){
                if(a[i] == b[j]){
                    index++;
                    break;
                }
            }
        }
        int[] resultatet = new int[a.length - index];

        index = 0;
        for(int i = 0; i < a.length; i++ ){
            boolean flag = true;
            for (int j = 0 ; j < b.length; j++){
                if(a[i] == b[j]){
                    flag = false;
                }
            }
            if (flag) {
                resultatet[index] = a[i];
                index++;
            }

        }

        return resultatet;
    }

    public static void main(String[] args) {

        int[] a = arrayDiff(new int[]{1, 2,3,4,5}, new int[]{4,1,1,4,5,5,2});
        for (int b : a) {
            System.out.println(b);
        }
    }

}
