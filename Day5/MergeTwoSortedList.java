package Day5;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        ListNode head=new ListNode(1);
        ListNode ptr3=head;
        while(ptr1!=null&&ptr2!=null){
            if(ptr1.val<ptr2.val){
                ptr3.next=ptr1;
                ptr3=ptr3.next;
                ptr1=ptr1.next;
            }
            else{
                ptr3.next=ptr2;
                ptr3=ptr3.next;
                ptr2=ptr2.next;
            }
        }
        if(ptr1!=null)
            ptr3.next=ptr1;
        else
            ptr3.next=ptr2;
        return head.next;
    }
}