public class stringarrEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String string : word1) {
            str1.append(string);
        }
        for (String string : word2) {
            str2.append(string);
        }
        return str1.toString().equals(str2.toString());
    }
}
