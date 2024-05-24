import java.util.HashMap;
import java.util.Map;

public class decode {
    public String decodeMessage(String key, String message) {
        StringBuilder decodedMssg = new StringBuilder();
        Map<Character,Character> subsTable = new HashMap<>();
        int charASCII = 97;
        for (int index = 0; index < key.length(); index++) {
            char eachChar = key.charAt(index);
            if (eachChar != ' ') {
                char getkey = eachChar;
                if (!subsTable.containsKey(getkey)) {
                    subsTable.put(eachChar, (char) charASCII);
                    charASCII++;
                }
            }
        }

        for (int mssgindex = 0; mssgindex < message.length(); mssgindex++) {
            char getChar = message.charAt(mssgindex);
            if (getChar == ' ') {
                decodedMssg.append(' ');
            }else {
                if (subsTable.containsKey(getChar)) {
                    char subValue = subsTable.get(getChar);
                    decodedMssg.append(subValue);
                }
            }
        }
        return new String(decodedMssg);
    }
    
}
