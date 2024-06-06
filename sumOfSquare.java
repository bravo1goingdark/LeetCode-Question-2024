class sumOfSquare {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end =(int) Math.sqrt(c);
        while(start <= end){
            long sum = (start*start + end*end);
            if(sum == c){
                return true;
            }else if(sum < c){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}