public class playertowin {
    public static int getWinner(int[] skills, int k) {
        int n = skills.length;
        int currentWinner = 0;  // Start with the first player
        int winCount = 0;

        // Iterate through the players starting from the second one
        for (int i = 1; i < n; i++) {
            if (skills[currentWinner] > skills[i]) {
                winCount++;
                if (winCount == k) {
                    return currentWinner;
                }
            } else {
                currentWinner = i;
                winCount = 1;  // Challenger wins, so reset the win count
                if (winCount == k) {
                    return currentWinner;
                }
            }
        }

        // If no player has reached k wins, the highest skill player at the end
        return currentWinner;
    }
}
