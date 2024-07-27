public class perfectSqaure {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(80821));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long start = 2;
        long end = num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sqaured = mid * mid;

            if (sqaured == num) {
                return true;
            } else if (sqaured > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
