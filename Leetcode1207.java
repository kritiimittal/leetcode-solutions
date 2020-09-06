class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                
                int v=map.get(arr[i])+1;
                map.put(arr[i],v);
                
            }else{
                map.put(arr[i],1);
            }
        }
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int key:map.keySet()){
            if(set.contains(map.get(key))){
                return false;
            }else{
                set.add(map.get(key));
            }
            
        }
        
        return true;
        
    }
}
