class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            sum += (Math.abs(((c - 'a')+1)-26)+1)*(i+1);
        }
        return sum;

    }
}