class Solution {
    private int sum(int n) {
        int[] arr = new int[2];
        arr[1] = 1;
        while (n > 0) {
            int res = n % 10;
            arr[0] = arr[0] + res;
            arr[1] = arr[1] * res;
            n /= 10;
        }
        
        return arr[0] + arr[1];
    }

    public boolean checkDivisibility(int n) {
        
        return n % sum(n) == 0 ? true : false;
    }
}