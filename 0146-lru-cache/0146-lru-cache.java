class LRUCache {

    private static class Node{
        int key,value;
        Node next;
        Node prev;

        Node(int key,int value){
            this.key=key;
            this.value=value;
           
        }
    }

    private HashMap<Integer,Node> map = new HashMap<>();
    static Node head;
    static Node tail;
    int capacity;

    public LRUCache(int capacity) {
        
        this.capacity = capacity;
         head = new Node(0,0);
            tail = new Node(0,0);
            head.next=tail;
            tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node temp = map.get(key);
        remove(temp);
        insertAtHead(temp);

        return temp.value;
    }
    
    public void put(int key, int value) {
        
       if(map.containsKey(key)){
            Node temp = map.get(key);
            temp.value = value;
            remove(temp);
            insertAtHead(temp);
       }
       else{
        if(map.size() == capacity){
            map.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node newNode = new Node (key,value);
        map.put(key,newNode);
        insertAtHead(newNode);
       }
    }

    private static void insertAtHead(Node node){

        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
       

    }
    private static void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */