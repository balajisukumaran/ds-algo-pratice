package Day6;

import java.util.HashMap;

public class CloneLinkedList {
    HashMap<Node,Node> hash=new HashMap();
    //recursive
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        if(this.hash.containsKey(head)){
            return this.hash.get(head);
        }
        Node new_node=new Node(head.val);
        this.hash.put(head,new_node);
        new_node.next=this.copyRandomList(head.next);
        new_node.random=this.copyRandomList(head.random);
        return hash.get(head);
    }
    //iterative
    public Node copyRandomListIterative(Node head)   {     
        if (head == null) {
        return null;
    }
    Node ptr=head;
    while(ptr!=null){
        Node new_node=new Node(ptr.val);
        new_node.next=ptr.next;
        ptr.next=new_node;
        ptr=ptr.next.next;
    }
    ptr=head;
    while(ptr!=null){
        ptr.next.random=(ptr.random!=null)? ptr.random.next:null;
        ptr=ptr.next.next;
    }
    Node new_head=head.next;
    Node ptr_old=head;
    Node ptr_new=head.next;
    while(ptr_old!=null){
        ptr_old.next=(ptr_old.next!=null) ? ptr_old.next.next:null;
        ptr_new.next=(ptr_new.next!=null) ? ptr_new.next.next:null;
        ptr_old=ptr_old.next;
        ptr_new=ptr_new.next;
    }
    return new_head;
    }
}