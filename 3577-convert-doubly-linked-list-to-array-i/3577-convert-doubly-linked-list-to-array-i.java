/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        Node temp = head;
        int index = 0;
        int size = 0;
        while(temp!=null){
          size++;
          temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        while(temp!=null){
          arr[index++] = temp.val;
          temp = temp.next;
        }
          
        return arr;
    }
}