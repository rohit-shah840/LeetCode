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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=null;
        if(head==null){
            return null;
        }
        while(curr!=null){
            if(head.val == val){
                head=head.next;
                curr=curr.next;
            }else if(curr.val==val){
                    prev.next=curr.next;
                curr=curr.next;
            }else{
                 prev=curr;
            curr=curr.next;
        }
      }
        return head;
    }
}