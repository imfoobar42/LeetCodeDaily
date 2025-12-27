class MyQueue {

  private Stack<Integer> sInsertion; //stack 1 for insertion
  private Stack<Integer> sDeletion;  //stack 2 for deletion

  public MyQueue() {
    this.sInsertion = new Stack<Integer>();
    this.sDeletion = new Stack<Integer>();
  }

  public void push(int x) {
    //insertion of element in stack 1 
    sInsertion.push(x);
  }

  public int pop() {
    if(!sDeletion.isEmpty()) return sDeletion.pop();
    //if(sInsertion.isEmpty()) return -1; //no element to return
    while(!sInsertion.isEmpty()){
      int poppedElement =  sInsertion.pop();
      sDeletion.push(poppedElement);
    }
    return sDeletion.pop();
  }

  public int peek() {
    if(!sDeletion.isEmpty()) return sDeletion.peek();
    while(!sInsertion.isEmpty()){
      int poppedElement =  sInsertion.pop();
      sDeletion.push(poppedElement);
    }
    return sDeletion.peek();
  }

  public boolean empty() {
    if(sDeletion.isEmpty() && sInsertion.isEmpty()) return true;
    return false;
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */