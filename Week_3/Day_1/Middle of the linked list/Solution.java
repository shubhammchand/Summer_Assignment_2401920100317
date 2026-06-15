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
        ListNode it=head;
        ListNode itn=head.next;

        while(itn!=null){
            it=it.next;
            if(itn.next==null){
                itn=itn.next;
            }
            else{
                itn=itn.next.next;
            }
        }
        return it;
    }
}
