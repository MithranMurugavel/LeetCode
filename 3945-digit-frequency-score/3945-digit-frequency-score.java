class Solution {
    public int digitFrequencyScore(int n) {
        
        int len = Integer.toString(n).length();
        int[] arr = new int[10];
        int sum = 0;
        while(n != 0){
            arr[n%10]++;
            n/=10;
        }

        for(int i=0;i<10;i++){
            sum+=arr[i]*i;
        }

        return sum;
    }
}