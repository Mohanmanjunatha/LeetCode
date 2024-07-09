//brute:
// add all the elements to single list and sort the list:
//TC=O(nlogn),, SC=O(n)
//2nd approach:
//taking three pointers comparing each for lesser and adding them one by one to new list;
//TC:O(n X K), k=no of lists.   
//optimized:
// using min heap priority queue:will sort  the elements and will put this in a different list and will 
// print the first element 
//TC:O(nlogn) we have to put n  elements  in sorted order in new list
//We initialize the priority queue with the first node of each of the K lists.
//Adding each node to the priority queue takes O(log K) time
// for adding k number of lists take O(k log k) time
// SC: O(n) since we use additional priority queue


class Solution{
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        
        for (ListNode list:lists){
            while(list!=null){
                minHeap.add(list.val);
                list=list.next;
            }
        }
        // take all the elements from minheap and put it inside the mergelist
        //create a dummy node to hold the head since we missout 
        ListNode dummy=new ListNode(1);
        ListNode merge=dummy;
        while (!minHeap.isEmpty()){
            merge.next=new ListNode(minHeap.remove());
            merge=merge.next;
        }
        return dummy.next;
        
    }
}