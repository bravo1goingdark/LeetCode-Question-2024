public class minChair {
    public static int minChairsNeeded(String s) {
        int occupiedChairs = 0;
        int maxNeededChairs = 0;

        for (char event : s.toCharArray()) {
            if (event == 'E') {
                occupiedChairs++;
                maxNeededChairs = Math.max(maxNeededChairs, occupiedChairs);
            } else if (event == 'L') {
                occupiedChairs--;
            }
        }

        return maxNeededChairs;
    }
}
