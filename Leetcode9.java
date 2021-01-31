class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
          return false;
      }  
      
      int org=x;
      int rev=0;
      while(x!=0){
          
          int val=x%10;
          rev=rev*10+val;
          x=x/10;
      }
        
      return org==rev;  
      
    }
}
