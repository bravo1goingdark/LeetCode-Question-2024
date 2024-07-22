
public class validpalin {
    public boolean isPalindrome(String s) {
        Pair res = norm(s);
        char[] arr = res.getCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    private static Pair norm(String str){
        StringBuilder builder = new StringBuilder(str);
        
        for (int index = 0; index < builder.length(); index++) {
            if (Character.isUpperCase(builder.charAt(index))) {
                char ch = Character.toLowerCase(builder.charAt(index));
                builder.setCharAt(index, ch);
            }else if(builder.charAt(index) == ' ' || !(Character.isLetterOrDigit(builder.charAt(index)))){
                builder.deleteCharAt(index);
                index--;
            }
        }
        return new Pair(new String(builder).toCharArray(), builder.toString());
    }
}

class Pair {
    private char[] ch;
    private String str;

    public Pair(char[] ch , String str){
        this.ch = ch;
        this.str = str;
    }
    public char[] getCharArray(){
        return this.ch;
    }
    public String getStr(){
        return this.str;
    }
}