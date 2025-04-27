import java.util.Objects;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair() {

    }

    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" +
                "key=" + key +
                ", value=" + value +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;           // Check same reference
        if (o == null || getClass() != o.getClass()) return false; // Check class
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
