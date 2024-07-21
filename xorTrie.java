public class xorTrie {
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        for (int num : nums) {
            trie.insert(num);
        }
        int max = 0;

        for (int num : nums) {
            max = Math.max(max, trie.getMax(num));
        }
        return max;

    }

}

class Trie {
    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(int num) {
        Node node = root;
        for (int index = 31; index >= 0; index--) {
            int bit = (num >> index) & 1;
            if (!node.containsBit(bit)) {
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    public int getMax(int num) {
        Node node = root;
        int max = 0;

        for (int index = 31; index >= 0; index--) {
            int bit = (num >> index) & 1;
            if (node.containsBit(1 - bit)) {
                max = max | (1 << index);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return max;
    }

    private class Node {
        private Node[] links;

        public Node() {
            this.links = new Node[2];
        }

        public boolean containsBit(int bit) {
            return this.links[bit] != null;
        }

        public void put(int bit, Node node) {
            this.links[bit] = node;
        }

        public Node get(int bit) {
            return this.links[bit];
        }
    }
}
