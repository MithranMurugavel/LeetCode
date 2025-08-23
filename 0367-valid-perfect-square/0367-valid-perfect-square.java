class Solution {
    public boolean isPerfectSquare(int nu) {
        long num=(long)nu;
        long n = 1;

        while(num > (n*n)){
            n++;
        }

        return (n*n) == num ? true: false;
    }
}