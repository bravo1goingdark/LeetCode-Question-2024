public class defangIP {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char value = address.charAt(i);
            if (value == '.') {
                result.append("[.]");
            } else {
                result.append(value);
            }
        }
        return result.toString();
    }
}
