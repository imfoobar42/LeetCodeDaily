class MyHashMap {
  class Node {
    int key, value;
    Node next; //in case of collision

    Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private Node[] nodeBucket; //array of Nodes 
  private int capacity = 10_00_000;

  public MyHashMap() {
    this.nodeBucket = new Node[capacity];
  }

  private int hash(int key) {
    return key % capacity;
  }

  //put in O(1)
  public void put(int key, int value) {
    int index = hash(key);
    Node head = nodeBucket[index];
    Node temp = head;
    while (temp != null) {
      if (temp.key == key) {
        temp.value = value;
        return;
      }
    temp = temp.next;
    }
  Node newNode = new Node(key, value);
  newNode.next=head;
  nodeBucket[index] = newNode;
    }

  //get in O(1)
  public int get(int key) {
    int index = hash(key);
    Node curr = nodeBucket[index];

    while (curr != null) {
      if (curr.key == key) {
        return curr.value;
      }
      curr = curr.next;
    }
    return -1;
  }

  //remove value from key in O(1)
  public void remove(int key) {
    int index = hash(key);
    Node curr = nodeBucket[index];
    Node prev = null;

    while (curr != null) {
      if (curr.key == key) {
        if (prev == null) {
          nodeBucket[index] = curr.next;
        } else {
          prev.next = curr.next;
        }
        return;
      }
      prev = curr;
      curr = curr.next;
    }
  }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */