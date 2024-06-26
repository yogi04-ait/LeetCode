/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        while(node != null){
            
            if(node.next.next == null){
                node.val = node.next.val;
                node.next = null;
            }
            else{
                 node.val = node.next.val;
            }
            
            node = node.next;
        }
    }
}