/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
  //the graph may contain cycles 
  //so we need to keep track of the already copied nodes
  //to avoid infinite recursion
  private Map<Node, Node> map = new HashMap<>();

  public Node cloneGraph(Node node) {
    if (node == null)
      return null;

    if (map.containsKey(node))
      return map.get(node); //node already cloned

    Node clone = new Node(node.val); //clone the current node 
    map.put(node, clone);

    //call the fun for neighbor nodes
    for (Node adjNode : node.neighbors)
      clone.neighbors.add(cloneGraph(adjNode));
    return clone;
  }
}