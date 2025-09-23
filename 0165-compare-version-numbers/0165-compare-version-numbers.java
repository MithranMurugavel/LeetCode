class Solution {
    public int compareVersion(String v1, String v2) {
        
        // if(v1.equals(v2)){
        //     return 0;
        // }
        String[] sp1 = v1.split("\\.");
        String[] sp2 = v2.split("\\.");

        int[] arr1 = new int[sp1.length];
        int[] arr2 = new int[sp2.length];
        int p=0;
       for(String s:sp1){
            arr1[p++] = Integer.parseInt(s);
       }
       p=0;
       for(String s:sp2){
            arr2[p++] = Integer.parseInt(s);
       }
       
       int p1=0,p2=0;

       while(p1<arr1.length && p2 < arr2.length){

            if(arr1[p1] > arr2[p2]){
                return 1;
            }
            if(arr1[p1] < arr2[p2]){
                return -1;
            }

            p1++; p2++;
       }

       if(p2<arr2.length){
        while(p2<arr2.length){
            if(arr2[p2] != 0) return -1;
            p2++;
        }
       }

       if(p1<arr1.length){
        while(p1<arr1.length){
            if(arr1[p1] != 0) return 1;
            p1++;
        }
       }
        return 0;
    }
}