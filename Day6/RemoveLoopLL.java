package Day6;

public class RemoveLoopLL
{
    public static void main(String[] args) {
        // Node head=new Node(7);
        // Node ptr=head;
        // ptr.next=new Node(2);
        // ptr=ptr.next;
        // Node cycle=ptr;
        // ptr.next=new Node(3);
        // ptr=ptr.next;
        // ptr.next=cycle;
        Node head=new Node(7);
        Node ptr=head;
        Node cycle=head;
        ptr.next=new Node(58);
        ptr=ptr.next;
        ptr.next=new Node(36);
        ptr=ptr.next;
        ptr.next=new Node(34);
        ptr=ptr.next;
        ptr.next=new Node(16);
        ptr=ptr.next;
        ptr.next=head;
        RemoveLoopLL obj=new RemoveLoopLL();
        obj.removeLoopInLL(head);
    }
    public void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        RemoveLoopLL obj=new RemoveLoopLL();
        obj.removeLoopInLL(head);
    }
    public void removeLoopInLL(Node head){
        if(head==null) return ;
        Node slow=head;
        Node fast=head;
        boolean isCycle=false;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
        
        if(isCycle==true){
            fast=head;
            if(fast!=slow){
                while(fast.next!=slow.next){
                    fast=fast.next;
                    slow=slow.next;
                }
                slow.next=null;
            }
            else{
                fast=fast.next;
                while(fast.next!=slow){
                    fast=fast.next;
                }
                fast.next=null;
            }
        }
    }
}