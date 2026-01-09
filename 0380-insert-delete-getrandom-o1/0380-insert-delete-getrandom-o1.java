class RandomizedSet {

    //insert O(1) in List, HashMap
    private List<Integer> list;
    private Map<Integer,Integer> map;
    Random random = new Random();

    public RandomizedSet() {
    this.list = new ArrayList<>();    //O(1) insert 
    this.map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        //insert into ArrayList
        if(map.containsKey(val)) return false; //value present 
        //value not present 
        list.add(val); // add value to the list
        map.put(val,list.size()-1); //key, index in list
        return true; 
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        
        //move element to be removed to the last location 
        //remove the element instead of shifting all elements 
        int index = map.get(val);
        int lastElement = list.get(list.size()-1); 
        list.set(index, lastElement);
        map.put(lastElement, index); //change index for lastElement
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */