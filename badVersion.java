public class badVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left)/2;

            if (isBadVersion(mid)) { // provided api 
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isBadVersion'");
    }
}
