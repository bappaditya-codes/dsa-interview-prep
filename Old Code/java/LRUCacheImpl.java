import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheImpl {

    static class LRUCache extends LinkedHashMap<Integer, Integer> {

        private final int capacity;

        LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        public int getValue(int key) {
            return getOrDefault(key, -1);
        }

        public void putValue(int key, int value) {
            put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(
                Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.putValue(1, 100);
        cache.putValue(2, 200);

        System.out.println(cache.getValue(1));

        cache.putValue(3, 300);

        System.out.println(cache.getValue(2));
        System.out.println(cache.getValue(3));
    }
}
