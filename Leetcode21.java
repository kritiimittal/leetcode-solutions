/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null && l2!=null){
            return l2;
        }
        if(l1!=null && l2==null){
            return l1;
        }

        ListNode h3=null;
        ListNode t3=null;
        while(l1!=null && l2!=null){
            
            if(l1.val<=l2.val){
                
                if(h3==null){
                    h3=l1;
                    t3=l1;
                    
                }else{
                    t3.next=l1;
                    t3=t3.next;
                    
                }
                
                l1=l1.next;
            }else{
                if(h3==null){
                    h3=l2;
                    t3=l2;
                    
                }else{
                    t3.next=l2;
                    t3=t3.next;
                    
                }
                
                l2=l2.next;
            }
         }
        
        
        if(l1!=null){
            t3.next=l1;
            
        }
        if(l2!=null){
            t3.next=l2;
        }
        
        
        return h3;
        
        
    }
}
