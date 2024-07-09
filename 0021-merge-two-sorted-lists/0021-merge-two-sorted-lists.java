//create 3 list
// craete two pointers
//compare each pointer and check which one is less and add it to 3rd list
// base case when both aree of same add them both and icremeent both the pointers 
//we create a dummy node since we need to return the head
//we need to assign this as head and then start adding values to the third list


class Solution{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode Dummy=new ListNode(1);
        ListNode merge=Dummy;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                merge.next=list1;
                list1=list1.next;
                
            }
            else{
                merge.next=list2;
                list2=list2.next;
                
            }
            merge=merge.next;
        }
        
        if (merge.next==list1 && list1==null){
            merge.next=list2;
            
        }
        else{
            merge.next=list1;
        }
        return Dummy.next;
    }
    
}