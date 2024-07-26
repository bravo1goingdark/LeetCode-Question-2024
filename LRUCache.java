import java.util.HashMap;
import java.util.Map;


class LRUCache {
    private Map<Integer,Node> map;
    private Node head;
    private Node tail; 
    private int length;

    public LRUCache(int capacity) {
        this.map = new HashMap<>(capacity);
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        this.length = capacity;
    }
    public void put(int key, int value) {
        if (this.map.containsKey(key)) {
            remove(map.get(key));

        }
        if (this.map.size() == length) {
            remove(tail.prev);
        }

        insert(new Node(key, value));

    }
    
    public int get(int key) {
        if(this.map.containsKey(key)){
            Node node = this.map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else {
            return -1;
        }
    }

    private void insert(Node node) {
        this.map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
    private void remove(Node node) {
       this.map.remove(node.key);
       node.prev.next = node.next;
       node.next.prev = node.prev;
    }

    private class Node {
        private int key;
        private int value;
        public Node next;
        public Node prev;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */