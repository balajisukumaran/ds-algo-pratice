package Day7;

public class StartOfLoop {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        boolean isCycle=false;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(isCycle==true){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
        else return null;
    }
}
