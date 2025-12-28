class MyStack {

  private Queue<Integer> activeQ;
  private Queue<Integer> bufferQ;

  public MyStack() {
    this.activeQ = new LinkedList<>();
    this.bufferQ = new LinkedList<>();
  }
  private void swap(){
    Queue<Integer> q = this.activeQ;
    this.activeQ = bufferQ;
    this.bufferQ = q;
  }
  public void push(int x) {
    activeQ.add(x); //insert into q1
  }

  public int pop() {
    while (activeQ.size() > 1)
      bufferQ.add(activeQ.remove());
    int top = activeQ.remove();
    swap();
    return top;
  }
  public int top() {
    while (activeQ.size() > 1)
      bufferQ.add(activeQ.remove());
    int top = activeQ.remove();
    bufferQ.add(top);
    //now swap the queues 
    swap();
    return top;
  }

  public boolean empty() {
    return activeQ.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */