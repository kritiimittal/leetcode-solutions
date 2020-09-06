class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            
            if(map1.containsKey(nums1[i])){
                int v=map1.get(nums1[i])+1;
                map1.put(nums1[i],v);
            }else{
                map1.put(nums1[i],1);
            }
            
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            
            if(map1.containsKey(nums2[i])){
                ans.add(nums2[i]);
                map1.remove(nums2[i]);
                
                
            }
        
    }
        
        int a[]=new int[ans.size()];
        for(int i=0;i<a.length;i++){
            a[i]=ans.get(i);
            
            
        }
        
       return a; 
    }    
        
}
