public class employeetarget {
    
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int thours : hours) {
            if (thours >= target) {
                count++;
            }
        }
        return count;
    }
}
