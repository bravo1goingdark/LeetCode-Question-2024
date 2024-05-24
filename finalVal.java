public class finalVal {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                finalValue++;
            } else if (operation.equals("X--") || operation.equals("--X")) {
                finalValue--;
            }
        }
        return finalValue;
    }
}
