class Solution {
    public static boolean sol(int n,Map<Integer,List<Integer>> list,int src,int dest, Set<Integer> set){

        if(src==dest) return true;
        set.add(src);
        for(int val:list.getOrDefault(src,new ArrayList<>())){
            if(!set.contains(val)){
                if(sol(n,list,val,dest,set)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer,List<Integer>> list=new HashMap<>();
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            list.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            list.computeIfAbsent(v,k->new ArrayList<>()).add(u);
        }
        Set<Integer> set=new HashSet<>();
        return sol(n,list,source,destination,set);
    }
}