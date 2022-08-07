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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode curr= head;
        if(head==null) return head;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
         if(c%2==0){
             int x =(c/2);
             curr=head;
             while( x!=0){
                 curr=curr.next;
                 x--;
             }
            return curr;
         }else{
              int x =(c/2);
             curr=head;
             while( x!=0){
                 curr=curr.next;
                 x--;
             }
            return curr;
         } 
    }
}