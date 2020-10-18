class Solution {
    public int lastStoneWeight(int[] stones) {
      
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:stones){
            pq.add(i);
        }
        
        while(pq.size()>1){
            int v1=pq.remove();
            int v2=pq.remove();
            pq.add(v1-v2);
        }
        
        return pq.peek();
    }
}
