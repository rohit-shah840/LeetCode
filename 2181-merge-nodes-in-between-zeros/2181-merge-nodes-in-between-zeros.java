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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr= head.next;
        ListNode temp=null;
        ListNode curr1=null;
        int c=0;
                int sum=0;
        while(curr!=null){
           if(curr.val!=0){
               sum+=curr.val;
               curr=curr.next;
           }else{
               c++;
               if(c==1){
               temp=curr;
               temp.val=sum;
               curr1=temp;
               }else{
                   curr1.next=curr;
                   curr1=curr1.next;
                   curr1.val=sum;
               }
               curr=curr.next;
               sum=0;
           }
        }
        return temp;
    }
}