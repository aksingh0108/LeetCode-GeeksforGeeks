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
        ListNode ptr1=head,ptr2=head;
        int n=0;
        while(head!=null){
            head=head.next;
            n++;
            }
        if(n%2==0){
            while(ptr2!=null){
                ptr1=ptr1.next;
                ptr2=ptr2.next.next;
            }
        }else{
            while(ptr2.next!=null){
                ptr1=ptr1.next;
                ptr2=ptr2.next.next;
            }
        }
        return ptr1;
    }
}