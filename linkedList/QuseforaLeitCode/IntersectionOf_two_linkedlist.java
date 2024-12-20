 /**import java.lang.classfile.components.ClassPrinter.ListNode;

public class IntersectionOf_two_linkedlist {
   
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null){
                return null;
            }

            ListNode temp = headA;

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = headB;

            ListNode ans = findStartingPointofcycle(headA);

            temp.next = null;

            return ans;
    }

    public ListNode findStartingPointofcycle(ListNode head){
        if(head ==null || head.next == null){
            return null;
        }

        ListNode slow = head.next; 
        ListNode fast = head.next.next;

        while(slow != fast && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        if(slow != fast) return null;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
}
 */
