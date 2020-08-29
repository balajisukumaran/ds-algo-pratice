package Day6;
class ListNode {
    int val;
     ListNode next;
     ListNode(int val)  { this.val = val;  next = null; }
 }
public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode firstHalfEnd=findMiddle(head);
        ListNode secondHalfStart=reverse(firstHalfEnd.next);
        ListNode p1=head;
        ListNode p2=secondHalfStart;
        boolean result=true;
        while(result&&p2!=null){
            if(p1.val!=p2.val) result=false;
            p1=p1.next;
            p2=p2.next;
        }
        firstHalfEnd.next=reverse(secondHalfStart);
        return result;
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode ptr=head;
        while(ptr!=null){
            ListNode next_node=ptr.next;
            ptr.next=pre;
            pre=ptr;
            ptr=next_node;
        }
        return pre;
    }
}
