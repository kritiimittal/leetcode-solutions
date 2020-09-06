class Solution {
    public int numIdenticalPairs(int[] nums) {
     
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int v=map.get(nums[i])+1;
                map.put(nums[i],v);
                
            }else{
                map.put(nums[i],1);
            }
        }
        
        int c=0;
        for(int key:map.keySet()){
            int temp=map.get(key);
            if(temp>1){
                c+=(temp*(temp-1))/2;
            }
            
        }
        return c;
        
    }
}
