class LRUCache {
    class Node{
        int key;
        int value;
        public Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }

    LinkedList<Node> list;
    Map<Integer, Node> map;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node cur=map.get(key);
            list.remove(cur);
            list.addFirst(cur);
            map.put(key, cur);
            return cur.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) list.remove(map.get(key));
        list.addFirst(new Node(key, value));
        map.put(key, list.peekFirst());
        if(list.size()>capacity){
            int deletedKey=list.removeLast().key;
            map.remove(deletedKey);
        }
    }
}
