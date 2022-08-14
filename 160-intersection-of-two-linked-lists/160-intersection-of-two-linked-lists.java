/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0;
        int b=0;
        ListNode curr1= headA;
        ListNode curr2=headB;
        while(curr1!=null){
            a++;
            curr1=curr1.next;
        }
         while(curr2!=null){
            b++;
            curr2=curr2.next;
        }
        int x = a>=b? a-b: b-a;
        curr1= headA;
        curr2= headB;
        if(a>=b){
            while(x!=0){
                curr1=curr1.next;
                x--;
            }
        }else{
             while(x!=0){
                curr2=curr2.next;
                x--;
            }
        }
        while(curr1!=curr2){
                curr1=curr1.next;
                curr2=curr2.next;
            if(curr1==null && curr2==null)
                return null;
        }
        return curr1;
    }
}