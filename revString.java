public class revString {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;

        while (first < last) {
            swap(s, first, last);
            first++;
            last--;
        }
    }

    public void swap(char[] chr , int index1 , int index2){
        char temp = chr[index1];
        chr[index1] = chr[index2];
        chr[index2] = temp;
    }
}
