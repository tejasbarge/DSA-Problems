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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null ||head.next==null || left==right ){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        int count=1;
        while(temp!=null && count<left){
            prev=temp;
            temp=temp.next;
            count++;
        }
        ListNode start=temp;

        if(prev!=null){
            prev.next=null;
        }
        int size=right-left;
        while(temp!=null && size>0){
            temp=temp.next;
            size=size-1;
        }
        ListNode end=temp;
        ListNode nextNode=end.next;
        end.next=null;

        ListNode revHead=rev(start);
        if(prev!=null){
            prev.next=revHead;
        }
        else{
            head=revHead;
        }
        start.next=nextNode;
        return head;
    }
    public ListNode rev(ListNode head){
        ListNode temp=head,front=null,prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}