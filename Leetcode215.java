class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            
        }
        
        int pos=0;
        while(pos<k-1){
            pq.remove();
            pos++;
        }
        
        int v=pq.remove();
        return v;
    }
}
