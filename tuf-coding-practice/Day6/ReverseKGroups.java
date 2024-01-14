package Day6;

public class ReverseKGroups {
    public ListNode reverse(ListNode head,int k){
        ListNode pre=null;
        ListNode ptr=head;
        while(k>0){
            ListNode next_node=ptr.next;
            ptr.next=pre;
            pre=ptr;
            ptr=next_node;
            k--;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode ptr=head;
        while(count<k&&ptr!=null){
            ptr=ptr.next;
            count++;
        }
        if(count==k){
            ListNode reversedHead=reverse(head,k);
            head.next=this.reverseKGroup(ptr,k);
            return reversedHead;
        }
        return head;
    }
    public ListNode reverseKGroupIterative(ListNode head, int k){
        ListNode ptr=head;
        ListNode new_head=null;
        ListNode ktail=null;
        while(ptr!=null){
            int count=0;
            ptr=head;
            while(count<k&&ptr!=null){
                ptr=ptr.next;
                count++;
            }
            if(k==count){
                ListNode revHead=reverse(head, k);
                if(new_head==null)
                    new_head=revHead;
                if(ktail!=null){
                    ktail.next=revHead;
                }
                ktail=head;
                head=ptr;
            }
        }
        if(ktail!=null){
            ktail.next=head;
        }
        return new_head;
    }
}