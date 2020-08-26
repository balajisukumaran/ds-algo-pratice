package Day5;

public class LinkedListMiddle {
    public ListNode middleNode(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null&&fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }
}