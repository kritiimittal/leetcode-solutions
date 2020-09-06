class Solution {
    public int repeatedNTimes(int[] A) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int v=map.get(A[i])+1;
                map.put(A[i],v);
            }else{
                map.put(A[i],1);
            }
            
            
        }
        int n=A.length/2;
        
        for(int key:map.keySet()){
            if(map.get(key)> 1){
                return key;
            }
        }
        
        return -1;
        
    }
}
