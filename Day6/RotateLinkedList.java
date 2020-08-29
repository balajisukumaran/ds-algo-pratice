package Day6;

public class RotateLinkedList {
    
    public ListNode rotateRight(ListNode head, int k) {
        ListNode ptr=head;
        int n=1;
        if(head==null) return head;
        if(k==0||head.next==null) return head;
        while(ptr.next!=null){
            ptr=ptr.next;
            n++;
        }
        ptr.next=head;
        ptr=head;
        for(int i=0;i<n-k%n-1;i++){
            ptr=ptr.next;
        }
        ListNode new_head=ptr.next;
        ptr.next=null;
        return new_head;
    }
}