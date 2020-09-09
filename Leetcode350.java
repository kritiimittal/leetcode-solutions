class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int ov=map.get(nums1[i])+1;
                map.put(nums1[i],ov);
                
            }else{
                map.put(nums1[i],1);
            }
        }
        
        
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            
            
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0 ){
                int ov=map.get(nums2[i]);
                int t=ov-1;
                map.put(nums2[i],t);
                temp.add(nums2[i]);
        }
    }
        
    int ans[]=new int[temp.size()];
    for(int i=0;i<temp.size();i++){
        ans[i]=temp.get(i);
        
    }
    
    return ans;
    
    }
    
        
}
