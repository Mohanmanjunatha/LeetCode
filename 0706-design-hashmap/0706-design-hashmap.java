class MyHashMap {

    class Node{
        int key;
        int value;
        Node next;
        public Node(int key, int value){ //constructor
            this.key=key;
            this.value=value;
            
        }
         
    }
    private Node[] storage;
    
    public MyHashMap(){
        this.storage= new Node[10000];
    }
    
    private int hash(int key){
        return key%10000;
    }
    private Node search(Node head, int key){// head is the full node and we can replace it as storage[idx]
        Node prev=null;
        Node curr=head;
        while(curr!=null && curr.key!=key){  //check if muy crrent element is not empty or its not the end of the list and we are matching the key aswell.
            prev=curr;
            curr=curr.next;
            
        }
        return prev;// returning the revious since the key will be present in the previous element
        
    }
    
    public void put(int key, int value) {
        int idx=hash(key);
        if( storage[idx]==null){
            storage[idx]=new Node(-1,-1);//initialise the ummy node to make sure its easy to delete first node if necessary
                
            
        }
        Node prev=search(storage[idx],key);// here we have to check if their exist any nodes of not.
        if(prev.next==null){
         prev.next=new  Node(key,value);//fresh node   
        }
        else{
            prev.next.value=value;
        }
       
        
        
    }
    
    public int get(int key) {
        int idx=hash(key);
        if( storage[idx]==null){
            return -1;
        }
            Node prev=search(storage[idx],key);
            if(prev.next==null)return -1;
            return prev.next.value;
            
        
        
        
    }
    
    public void remove(int key) {
                int idx=hash(key);
        if( storage[idx]==null) return ;
        Node prev=search(storage[idx],key);
            if(prev.next==null)return;
        Node temp=prev.next;
        prev.next=prev.next.next;
        temp.next=null;
        
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */