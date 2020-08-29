package Day6;
class Node {
    int data;
    int val;
    Node random;
     Node next;
     Node bottom;
     Node(int d)  { data = d; val=d; random = null;  next = null; bottom=null;}
 }
 class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         int length1=length(headA);
         int length2=length(headB);
         if(length1<length2){
             int diff=length2-length1;
             while(diff!=0){
                 headB=headB.next;
                 diff--;
             }
         }
         else if(length2<length1){
             int diff=length1-length2;
            while(diff!=0){
                 headA=headA.next;
                 diff--;
             }
         }
         while(headA!=null&&headB!=null){
            if(headA==headB)
                return headA.data;
            else{
                headA=headA.next;
                headB=headB.next;
            }
         }
         return -1;
	}
	public int length(Node head){
	    if(head==null)
	        return 0;
	    return 1+length(head.next);
	}
}