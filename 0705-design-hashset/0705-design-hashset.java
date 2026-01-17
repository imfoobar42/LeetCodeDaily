class MyHashSet {

    private boolean[] map;
    public MyHashSet() {
        this.map = new boolean[10_00_001];
    }
    
    public void add(int key) {
        map[key]=true;
    }
    
    public void remove(int key) {
        map[key]=false;
    }
    
    public boolean contains(int key) {
      return map[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */