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
    public int pairSum(ListNode head) {
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int arr[] = new int [c];
        curr=head;
        int i=0;
        while(curr!=null){
            arr[i]=curr.val;
            curr=curr.next;
            i++;
        }
        int max=-1;
        for(i=0;i<c/2;i++){
            if(max<=(arr[i]+arr[c-1-i])){
                max=arr[i]+arr[c-1-i];
            }
        }
        return max;
    }
}