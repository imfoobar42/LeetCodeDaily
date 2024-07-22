class Solution {
    private List<Integer> DFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        class Traverse {
            Traverse(TreeNode current) {
                if (current != null) {
                    if (current.left != null) {
                        new Traverse(current.left);
                    }
                    result.add(current.val);
                    if (current.right != null) {
                        new Traverse(current.right);
                    }
                }
            }
        }
        
        if (root != null) {
            new Traverse(root);
        }
        
        return result;
    }
    
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> res = DFS(root);
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}