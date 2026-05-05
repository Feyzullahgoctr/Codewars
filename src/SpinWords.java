public class SpinWords {

    public String spinWords(String sentence) {
        //TODO: Code stuff here

        String [] line = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < line.length; j++) {

            if (line[j].length() > 4) {
                for (int i = line[j].length() - 1; i >= 0; i--) {
                    sb.append(line[j].charAt(i));
                }
            } else {
                sb.append(line[j]);
            }

            if (line.length - 1 != j) {
                sb.append(" ");
            }

        }
        return sb.toString();

    }

    public void main(String[] args) {

        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));

    }

}
