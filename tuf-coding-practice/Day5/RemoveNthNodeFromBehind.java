package Day5;

public class RemoveNthNodeFromBehind {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=findLength(head);
        int deleteIndex=length-n;
        ListNode auxNode=new ListNode(0);
        auxNode.next=head;
        head=auxNode;
        ListNode pre=head;
        while(pre!=null&&pre.next!=null){
            if(deleteIndex==0){
                pre.next=pre.next.next;
                break;
            }
            else {
                deleteIndex--;
                pre=pre.next;
            }
        }
        return head.next;
    }
    public int findLength(ListNode ptr){
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
}