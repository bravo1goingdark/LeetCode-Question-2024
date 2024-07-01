public class prefix {
    public static void main(String[] args) {
        
        String[] str = {"flower" , "flow" , "flight"};
        System.out.println(longestCommonPrefix(str));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0 , prefix.length() - 1);
            }
        }
        return prefix;
    }

}
