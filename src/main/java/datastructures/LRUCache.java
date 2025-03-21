package datastructures;

/*****public class LRUCache {
 private int capacity;
 private HashMap<Integer, Integer> cache;
 private Queue<Integer> keyQueue;

 public LRUCache(int capacity) {
 this.capacity = capacity;
 cache = new HashMap<Integer, Integer>(capacity);
 keyQueue = new LinkedList<Integer>();

 }

 public int get(int key) {
 return cache.getOrDefault(key, -1);
 }

 public void put(int key, int value) {
 keyQueue.add(key);
 if (cache.keySet().size() > this.capacity) {
 if (keyQueue.size() > 0) {
 int firstUsedKey = keyQueue.poll();
 cache.remove(firstUsedKey);
 }
 }
 if (cache.containsKey(key)) {
 cache.replace(key, cache.get(key), value);
 } else {
 cache.put(key, value);
 }

 }
 }
 ///****///