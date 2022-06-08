package middleofthelinkedlist876;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head==null){
            return  null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null){
            if (fast.next.next!=null){
                fast=fast.next.next;
            }else {
                fast=fast.next;
            }
            slow=slow.next;
        }
        return slow;
    }
}
