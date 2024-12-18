/**
 *  for a litcode proble for a 206 in the  a Reverse linked list
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode reverseList(ListNode head) {
//             ListNode prev = null;

//             ListNode curr = head;

//             ListNode next;

//             while(curr != null){
//                 next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = next;
//             }

//             return head = prev;
//     }
// }