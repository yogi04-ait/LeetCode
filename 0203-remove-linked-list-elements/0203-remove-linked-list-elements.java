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
    public ListNode removeElements(ListNode head, int val) {
        
        while(head != null && head.val == val){
            head = head.next;
        }
        
        if(head == null){
            return head;
        }
        
        ListNode temp = head;
        
        while(temp != null && temp.next != null){
            
            if (temp.next.val == val) {
                // Skip the node with the target value
                temp.next = temp.next.next;
            } else {
                // Move to the next node
                temp = temp.next;
            }
            
        }
        
        return head;
        
        
    }
}