class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        int l[]=new int[heights.length];
        Stack<Integer> s=new Stack<>();
        l[0]=-1;
        s.push(0);
        for(int i=1;i<l.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                l[i]=-1;
            }else{
                l[i]=s.peek();
            }
            s.push(i);
            
        }
        
        
        int r[]=new int[heights.length];
        s=new Stack<>();
        r[r.length-1]=r.length;
        s.push(r.length-1);
        for(int i=r.length-2;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                r[i]=r.length;
            }else{
                r[i]=s.peek();
            }
            s.push(i);
            
        }
        
        
        
        int ma=0;
        for(int i=0;i<heights.length;i++){
            
            int width=r[i]-l[i]-1;
            int area=width*heights[i];
            if(area>ma){
                ma=area;
            }
            
        }
        
        return ma;
    }
}
