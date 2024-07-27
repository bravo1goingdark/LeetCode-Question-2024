public class coinArrange { 
    // O(N)
    public static int arrangeCoins(int n) {
        return coin(0, n, 1);
    }

    private static int coin(int count, int n, int row) {
        if (n < row) {
            return count;
        }

        return coin(count + 1, n - row, row + 1);

    }
    // O(log N)
    public static int arrangeCoinsBS(int n) {
        if (n == 0) {
            return 0;
        }

        long start = 1;
        long end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long k = mid * (mid + 1) / 2; 

            if (k == n) {
                return (int) mid;
            } else if (k < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) end;
    }
}
