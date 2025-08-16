class Solution {
    public int maximum69Number (int num) {
        
        String str=Integer.toString(num);
        char[] arr=str.toCharArray();

        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]=='6'){
               arr[i]='9';
               break;
            }
        }

        int sum=0;
        for(int j=0;j<arr.length;j++){
            int val=arr[j]-'0';
            sum=sum*10+val;
        }
        return sum;
    }
}