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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
       ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr= head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        int l= arr.size();
        int r= k%l;
        for(int j=0;j<r;j++){
             int t= arr.get(arr.size()-1);
             for(int i=arr.size()-1;i>0;i--){
            arr.set(i,arr.get(i-1));
        }
            arr.set(0,t);
            //System.out.println(arr);
        }
        curr= head;
        int x=0;
          while(curr!=null){
           curr.val=arr.get(x);
            curr=curr.next;
              x++;
        }
        return head;
    }
}