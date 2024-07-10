//bruteforce
//navigate to find the length and use formula l-n+1
//we navigate twice to find the length and to navigate for deletion
// optimized
//creating a dummy node and assiging both pointers to it
//creating a difference between front and back  using for loop
// traverse through the list by incrementing both using while
//at last when u find null swap the back.next with back.next.next
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
 
        ListNode Dummy = new ListNode(1);
        Dummy.next=head;
         ListNode front=Dummy;
        ListNode back=Dummy;
        for (int i=0;i<=n;i++){// moving front pointer 2 steps forward 
            front=front.next;
        } 
        while(front!=null){// traversing through the list
            front=front.next;
            back=back.next; 
        }
        back.next=back.next.next;//now swapping the referrences 
        return Dummy.next;
        
    }
}
        