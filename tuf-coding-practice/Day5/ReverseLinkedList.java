package Day5;
 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode ptr=head;
        if(ptr==null) return null;
        while(ptr!=null){
            ListNode next_node=ptr.next;
            ptr.next=pre;
            pre=ptr;
            ptr=next_node;
        }
        return pre;
        }
}