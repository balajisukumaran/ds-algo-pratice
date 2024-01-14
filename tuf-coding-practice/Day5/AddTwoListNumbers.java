package Day5;

public class AddTwoListNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode node=result;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+carry;
            ListNode new_node=new ListNode(sum%10);
            node.next=new_node;
            node=node.next;
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null){
            int sum=l1.val+carry;
            ListNode new_node=new ListNode(sum%10);
            node.next=new_node;
            node=node.next;
            carry=sum/10;
            l1=l1.next;
        }
        while(l2 != null){
            int sum=l2.val+carry;
            ListNode new_node=new ListNode(sum%10);
            node.next=new_node;
            node=node.next;
            carry=sum/10;
            l2=l2.next;
        }
        if(carry!=0)
        {
            ListNode new_node=new ListNode(carry);
            node.next=new_node;
        }
        return result.next;
    }   
}