

public class numComp {

    public int bitwiseComplement(int n) {
        
        StringBuilder bits = new StringBuilder(Integer.toBinaryString(n));
        

        for (int index = 0; index < bits.length(); index++) {
            char ch = bits.charAt(index);
            if (ch == '1') {
                bits.setCharAt(index, '0');
            }else {
                bits.setCharAt(index, '1');
            }
        }

        return Integer.parseInt(bits.toString(),2);
    }
}