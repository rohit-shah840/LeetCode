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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int c=0;
        ListNode curr= head;
        ListNode prev = curr;
        if(head==null) return head;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        
        int x= c-n;
        
        if(x==0){
            head=head.next;
            return head;
        }
        curr= head;
        while(x!=0){
           prev = curr;
            curr=curr.next;
            x--;
        }
        
        prev.next= curr.next;
        curr.next =null;
        
           return head;                
    }
}