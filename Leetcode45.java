class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        
        int a=nums[0];
        int b=nums[0];
        int jump=1;
        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1){
                return jump;
            }
            a--;
            b--;
            if(nums[i]>b){
                b=nums[i];
            }
            if(a==0){
                ++jump;
                a=b;
                
            }
            
        }
        
        return jump;
        
        
    }
}
