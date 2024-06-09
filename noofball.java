class noofball {
    public int numberOfChild(int n, int k) {
        int position = 0;  // The ball starts with child 0
        int direction = 1; // Initial direction is to the right
    
        for (int i = 0; i < k; i++) {
            position += direction;
    
            // Reverse direction if we hit either end
            if (position == 0 || position == n - 1) {
                direction = -direction;
            }
        }
    
        return position;
    }
}