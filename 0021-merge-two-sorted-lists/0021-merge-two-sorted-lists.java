

class Solution{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if (list1==null){
            return list2;
        }// reccursion we have used here 
        if (list2==null){
            return list1;
        }// list1 continues with its next value in next loop
        if (list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }// list continues adding with its next value and the list 1 
        else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}