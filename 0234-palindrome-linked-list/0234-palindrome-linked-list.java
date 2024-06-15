/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) {
            return true;
        }
        
        // Finding the mid node 
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the list
        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfHead = head;
        
        // Check if palindrome
        ListNode secondHalfCopy = secondHalfHead; // To restore the list later
        boolean isPalin = true;
        while (secondHalfHead != null) {
            if (firstHalfHead.val != secondHalfHead.val) {
                isPalin = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }
        
        // Restore the list
        reverseList(secondHalfCopy);
        
        return isPalin;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next; // store the next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev one step forward
            curr = next; // move curr one step forward
        }

        // prev will be the new head of the reversed list
        return prev;
    }
}
