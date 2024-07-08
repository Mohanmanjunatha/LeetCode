
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = newHead;
            newHead = current;
            current = nextNode;
        }
        
        return newHead;
    }
}

