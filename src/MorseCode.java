import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public static String decode(String morseCode) {
        // you can use the preloaded MorseCode:
        // char letter = MorseCode.get(morse)

        Map<String, String> morseMap = new HashMap<>();

        morseMap.put(".-", "A");
        morseMap.put("-...", "B");
        morseMap.put("-.-.", "C");
        morseMap.put("-..", "D");
        morseMap.put(".", "E");
        morseMap.put("..-.", "F");
        morseMap.put("--.", "G");
        morseMap.put("....", "H");
        morseMap.put("..", "I");
        morseMap.put(".---", "J");
        morseMap.put("-.-", "K");
        morseMap.put(".-..", "L");
        morseMap.put("--", "M");
        morseMap.put("-.", "N");
        morseMap.put("---", "O");
        morseMap.put(".--.", "P");
        morseMap.put("--.-", "Q");
        morseMap.put(".-.", "R");
        morseMap.put("...", "S");
        morseMap.put("-", "T");
        morseMap.put("..-", "U");
        morseMap.put("...-", "V");
        morseMap.put(".--", "W");
        morseMap.put("-..-", "X");
        morseMap.put("-.--", "Y");
        morseMap.put("--..", "Z");

        // Sayılar
        morseMap.put("-----", "0");
        morseMap.put(".----", "1");
        morseMap.put("..---", "2");
        morseMap.put("...--", "3");
        morseMap.put("....-", "4");
        morseMap.put(".....", "5");
        morseMap.put("-....", "6");
        morseMap.put("--...", "7");
        morseMap.put("---..", "8");
        morseMap.put("----.", "9");
        morseMap.put(".-.-.-", ".");
        morseMap.put("--..--", ",");
        morseMap.put("..--..", "?");
        morseMap.put("-.-.--", "!");
        morseMap.put("---...", ":");
        morseMap.put("-.-.-.", ";");
        morseMap.put("-.--.", "(");
        morseMap.put("-.--.-", ")");
        morseMap.put(".-..-.", "\"");
        morseMap.put(".----.", "'");
        morseMap.put("..--.-", "_");
        morseMap.put("-....-", "-");
        morseMap.put("-..-.", "/");
        morseMap.put(".--.-.", "@");
        morseMap.put("-...-", "=");
        morseMap.put(".-.-.", "+");
        morseMap.put(".-...", "&");
        morseMap.put("...-..-", "$");
        morseMap.put("...---...", "SOS");


        morseCode = morseCode.trim();
        String[] data = morseCode.split(" ");
        String newWord="";
        for (int i = 0; i < data.length; i++) {
            String word = morseMap.get(data[i].trim());
            if (word != null) {
                newWord += word;
            } else if (word != morseMap.get(data[i + 1].trim()) && (i + 1) < data.length) {
                newWord += " ";
            }
        }

        return newWord; // your brilliant code here
    }

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(decode("  ...---... "));
        System.out.println(decode("     --.. -.-   -..-. .- ...-..- -..-.   --..   -.--        "));
        System.out.println(decode("          ..- -....-   - . .. ...-- ...-   ..--.- --.. .----. .....   ..--- --. . --...   --.- --.        "));


    }
}
