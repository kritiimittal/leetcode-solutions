class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],true);
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        
        int ml=0;
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])==true){
                int tl=1;
                while(map.containsKey(nums[i]+tl)){
                    tl++;
                    
                }
                
                if(ml<tl){
                    ml=tl;
                }
            }
            
            
        }
        
        return ml;
    }
}
