class MyLinkedList {

  class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public MyLinkedList() {
  }

  private Node getNode(int index) {
    if (index < 0 || index >= size)
      return null;
    int i = 0;
    Node tempNode = head;
    while (tempNode != null && i != index) {
      tempNode = tempNode.next;
      i++;
    }
    return tempNode;
  }

  public int get(int index) {
    Node node = getNode(index);
    return node == null ? -1 : node.val;
  }

  public void addAtHead(int val) {
    Node newNode = new Node(val);
    newNode.next = head; //new Node points to the head node 
    head = newNode; //make newNode the head node
    if (size == 0)
      tail = newNode;
    size++;
  }

  public void addAtTail(int val) {
    if (size == 0) addAtHead(val);
    else {
     //create the tail node 
      tail.next = new Node(val);
      tail = tail.next;
    size++;
    }
  }

  public void addAtIndex(int index, int val) {
    //check index 
    if (index < 0 || index > size)
      return;
    //index -> head 
    if (index == 0) {
      addAtHead(val);
      return;
    }
    //index -> tail 
    else if (index == size) {
      addAtTail(val);
      return;
    }
    //index -> somewhere middle case
    Node prevNode = getNode(index - 1);
    Node newNode = new Node(val);

    newNode.next = prevNode.next;
    prevNode.next = newNode;
    size++;
  }

  public void deleteAtIndex(int index) {
    //need a check on index
    if (index < 0 || index >= size)
      return;
    else if (size == 1) { //only 1 node
      head = null;
      tail = null;
    } else if (index == 0)
      head = head.next;
    else if (index == size - 1) {
      Node prevNode = getNode(index - 1);
      prevNode.next = null;
      tail = prevNode;
    } else {
      Node prevNode = getNode(index - 1);
      prevNode.next = prevNode.next.next;
    }
    size--;
  }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */