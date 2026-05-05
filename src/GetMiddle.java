public class GetMiddle {

    public static String getMiddle(String word) {
        //Code goes here!
        StringBuilder sb = new StringBuilder();

        int index = (int) Math.floor((double) (word.length() -1) / 2);
        sb.append(word.charAt(index));

        if (word.length() % 2 == 0) {
            sb.append(word.charAt(index + 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(getMiddle("WorldDan"));
        System.out.println(getMiddle("WordD"));

    }

}
