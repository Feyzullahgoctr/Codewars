public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        String[] list = new String[(int) Math.round((double) (s.length()) / 2)];

        for (int i = 0; i < list.length; i++) {
            list[i] = s.charAt(i * 2) + "" + ((i * 2) + 1 == s.length() ? "_" : s.charAt((i * 2) + 1));
        }

        return list;
    }

    public static void main(String[] args) {
        String s = "abcde";

        String[] slist = solution(s);

        for (String m : slist) {
            System.out.println(m);
        }



    }
}
