package linkedlistcycle141;

class ListNode {
     int val;
    ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null ){
            return false;
        }

        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast.val ==slow.val){
                return true;
            }
        }

        return false;
    }
}

