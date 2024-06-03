public class strAlike {
    public boolean halvesAreAlike(String s) {
        int mid = (s.length() / 2 ) - 1;
        String first = halvedStr(s, mid , 0);
        String second = halvedStr(s, s.length() - 1,mid+1);
        return countVowel(first) == countVowel(second) ? true : false;
    }
    public String halvedStr(String str ,int mid , int startIndex){
        String resstr = "";
        for (int i = startIndex; i <= mid ; i++) {
            resstr += str.charAt(i);
        }
        return resstr;
    }
    public int countVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||
            str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
