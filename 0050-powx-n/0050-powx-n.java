class Solution {

    public double myPow(double x, int n) {

    
        long power = n;

        if (power < 0) {
            x = 1 / x;      
            power = -power; 
        }

        return calculatePower(x, power);
    }

    private double calculatePower(double x, long power) {

        if (power == 0) {
            return 1;
        }

        
        double half = calculatePower(x, power / 2);

        
        if (power % 2 == 0) {
            return half * half;
        }

        
        return half * half * x;
    }
}