class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        int l=0;
        int i=0;
        int ml=0;
        HashSet<Character> set=new HashSet<>();
        while(i<s.length()){
            
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
                
            }else{
                set.add(s.charAt(i));
                ml=Math.max(set.size(),ml);
                i++;
            }
            
            
        }
        
        return ml;
        
    }
}
