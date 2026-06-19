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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null || k==1){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevNode=dummy;
        while(true){
            ListNode kth=getKth(prevNode,k);
            if(kth==null){
                break;
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            ListNode start=prevNode.next;

            ListNode newHead=rev(start);
            prevNode.next=newHead;
            start.next=nextNode;
            prevNode=start;
        }
        return dummy.next;
    }
    public ListNode getKth(ListNode temp,int k){
        while(temp!=null && k>0){
            temp=temp.next;
            k-=1;
        }
        return temp;
    }
    public ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        ListNode front=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}