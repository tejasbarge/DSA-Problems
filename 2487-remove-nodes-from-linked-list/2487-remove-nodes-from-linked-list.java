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
    public ListNode removeNodes(ListNode head) {
       ListNode temphead=reverse(head);
       ListNode temp=temphead;
       int largest=Integer.MIN_VALUE;
       while(temp!=null && temp.next!=null){
        if(temp.val>temp.next.val){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
       }
       return reverse(temphead);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode front=null,prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}