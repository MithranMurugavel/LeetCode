class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;

        Map<Integer, List<Integer>> map=new HashMap<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key=i+j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }

        int[] arr=new int[n*m];
        int i=0;

        for(int j=0;j<n+m-1;j++){
            List<Integer> list=map.get(j);

            if(j%2==0){
                Collections.reverse(list);
            }
            for(Integer val:list){
                arr[i++]=val;
            }
        }

        return arr;
    }
}