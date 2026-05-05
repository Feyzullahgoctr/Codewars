import java.util.ArrayList;

public class SentenceOrder {

    public static String order(String words) {
        // ...
        String[] data = words.trim().split(" ");
        ArrayList<String> arrays = new ArrayList<>();

        for (String d : data) {
            arrays.add(d);
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;


        while (arrays.size() > 0) {

            if (arrays.size() == 1 && arrays.get(0).equals("")) {
                sb.append(" ");
                break;
            }

            count++;
            for (int j = 0 ; j < arrays.size() ; j++) {
                String array = arrays.get(j);
                for (int i = 0; i < array.length(); i++) {
                    try {
                        int a = Integer.parseInt(String.valueOf(array.charAt(i)));
                        if (a == count) {
                            sb.append(array);
                            arrays.remove(j);
                        }

                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                    }
                }
            }
            sb.append(" ");

        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        //System.out.println(order(""));
    }

}
