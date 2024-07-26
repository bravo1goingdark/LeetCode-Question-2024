class ParkingSystem {
    private int[] slots; 

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[4]; 
        slots[1] = big;    
        slots[2] = medium;  
        slots[3] = small;   
    }
    
    public boolean addCar(int carType) {
        if (carType >= 1 && carType <= 3) { 
            if (slots[carType] > 0) {
                slots[carType] -= 1; 
                return true; 
            }
        }
        return false; 
    }
}
