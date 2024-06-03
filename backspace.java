public class backspace {
    public boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }
    
    private String processString(String str) {
        StringBuilder result = new StringBuilder();
        int backspaceCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                backspaceCount++;
            } else {
                if (backspaceCount > 0) {
                    backspaceCount--;
                } else {
                    result.append(str.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
