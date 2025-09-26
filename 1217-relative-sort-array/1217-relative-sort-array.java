class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int i = 0,j = 0;
        int n = 0;

        while( n < arr2.length){
                                                                                
            if(arr2[n] == arr1[j]){
                int temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
                j++; i++;

            }
            else {
                j++;
            }
            if(j == arr1.length){
                j = i;
                n+=1;
            }
            
        }
        if(i<arr1.length-1){
           Arrays.sort(arr1,i,arr1.length);
        }
        return arr1;
        
    }
}