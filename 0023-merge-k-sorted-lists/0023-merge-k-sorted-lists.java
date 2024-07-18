 class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null; 
        if (lists.length == 1) return lists[0];

        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        ListNode dummy = new ListNode(0); //creating an empty node
        ListNode temp = dummy; 

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            temp.next = minNode;
            temp = minNode;

            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        } 
        ListNode head = dummy.next;
      
        return head;
    }

}
