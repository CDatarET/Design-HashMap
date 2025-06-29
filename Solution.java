class MyHashMap {
    public ArrayList<Integer> list = new ArrayList<Integer>();

    public MyHashMap() {

    }
    
    public void put(int key, int value) {
        boolean broke = false;
        for(int i = 0; i < list.size(); i = i + 2){
            if(list.get(i) == key){
                list.set(i+1, value);
                broke = true;
                break;
            }
        }

        if(!broke){
            list.add(key);
            list.add(value);
        }
    }
    
    public int get(int key) {
        for(int i = 0; i < list.size(); i = i + 2){
            if(list.get(i) == key){
                return(list.get(i+1));
            }
        }
        return(-1);
    }
    
    public void remove(int key) {
        for(int i = 0; i < list.size(); i = i + 2){
            if(list.get(i) == key){
                list.remove(i);
                list.remove(i);
                break;
            }
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
