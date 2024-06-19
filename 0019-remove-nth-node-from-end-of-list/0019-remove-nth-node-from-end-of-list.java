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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        ListNode temp = head;
        int nodeLength = 0;
        
        while(temp != null){
            nodeLength++;
            temp = temp.next;        
            
        }
        
        if(nodeLength == n){
            return head.next;
        }
        
        int nodeCount = nodeLength - n;
        int start =1;
        temp = head;
        
        
        
        while(temp != null){
            
            if(temp.next != null && start == nodeCount){
                temp.next = temp.next.next;
            }
            
            temp = temp.next;
            start++;
        }
        
        
        return head;
        

        
    }
}