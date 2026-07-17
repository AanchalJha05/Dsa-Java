import java.util.LinkedList;
import java.util.Objects;

public class mycustomhashmap<K, V> {

    // Node class
    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " : " + value;
        }
    }

    private LinkedList<Node>[] hashTable;
    private int size;
    private int capacity;
    private final double loadFactor = 0.75;

    @SuppressWarnings("unchecked")
    public mycustomhashmap() {
        capacity = 16;
        size = 0;

        hashTable = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    // Returns bucket index
    private int getBucketIndex(K key) {
        int hash = Objects.hashCode(key);
        return Math.abs(hash) % capacity;
    }

    // Search key in a bucket
    private int searchKey(K key, int bucketIndex) {

        LinkedList<Node> bucket = hashTable[bucketIndex];

        for (int i = 0; i < bucket.size(); i++) {
            if (Objects.equals(bucket.get(i).key, key)) {
                return i;
            }
        }

        return -1;
    }

    // Insert or Update
    public void put(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int keyIndex = searchKey(key, bucketIndex);

        if (keyIndex == -1) {
            hashTable[bucketIndex].add(new Node(key, value));
            size++;
        } else {
            hashTable[bucketIndex].get(keyIndex).value = value;
        }

        if ((double) size / capacity >= loadFactor) {
            rehash();
        }
    }

    // Get Value
    public V get(K key) {

        int bucketIndex = getBucketIndex(key);
        int keyIndex = searchKey(key, bucketIndex);

        if (keyIndex == -1) {
            return null;
        }

        return hashTable[bucketIndex].get(keyIndex).value;
    }

    // Contains Key
    public boolean containsKey(K key) {
        return searchKey(key, getBucketIndex(key)) != -1;
    }

    // Remove Key
    public V remove(K key) {

        int bucketIndex = getBucketIndex(key);
        int keyIndex = searchKey(key, bucketIndex);

        if (keyIndex == -1) {
            return null;
        }

        V value = hashTable[bucketIndex].remove(keyIndex).value;
        size--;

        return value;
    }

    // Current Size
    public int size() {
        return size;
    }

    // Is Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Clear HashMap
    public void clear() {

        for (LinkedList<Node> bucket : hashTable) {
            bucket.clear();
        }

        size = 0;
    }

    // Rehash
    @SuppressWarnings("unchecked")
    private void rehash() {

        LinkedList<Node>[] oldTable = hashTable;

        capacity *= 2;
        size = 0;

        hashTable = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            hashTable[i] = new LinkedList<>();
        }

        for (LinkedList<Node> bucket : oldTable) {
            for (Node node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    // Display HashMap
    public void display() {

        for (int i = 0; i < capacity; i++) {

            if (!hashTable[i].isEmpty()) {

                System.out.print("Bucket " + i + " -> ");

                for (Node node : hashTable[i]) {
                    System.out.print("[" + node + "] ");
                }

                System.out.println();
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        mycustomhashmap<Integer, String> map = new mycustomhashmap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(18, "Grapes"); // Collision with key 2

        System.out.println("Value of key 2 : " + map.get(2));

        map.put(2, "Mango");

        System.out.println("Updated value of key 2 : " + map.get(2));

        System.out.println("Contains key 3 : " + map.containsKey(3));

        System.out.println("Removed : " + map.remove(1));

        System.out.println("Contains key 1 : " + map.containsKey(1));

        System.out.println("Size : " + map.size());

        System.out.println("\nHashMap Contents:");
        map.display();
    }
}