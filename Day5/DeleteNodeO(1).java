package Day5;

class DeleteNodeO1 {
    void deleteNode(ListNode node)
    {
         // Your code here
         node.val=node.next.val;
         ListNode new_next=node.next.next;
         node.next.next=null;
         node.next=new_next;
    }
}