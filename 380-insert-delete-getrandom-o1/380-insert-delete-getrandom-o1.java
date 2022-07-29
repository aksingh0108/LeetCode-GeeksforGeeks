class RandomizedSet {
    
    HashSet<Integer> hashSet;
    public RandomizedSet() 
    {
        hashSet=new HashSet<Integer>();
    }
    
    public boolean insert(int val) 
    {
        if(hashSet.contains(val))
            return false;
        hashSet.add(val);
        return true;
    }
    
    public boolean remove(int val) 
    {
        if(!hashSet.contains(val)) return false;
        
            hashSet.remove(val);
            return true;
        
       
    }
    
    public int getRandom() {
        Integer[] temp = hashSet.toArray(new Integer[0]);
        return temp[(int)(Math.random()*temp.length)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */