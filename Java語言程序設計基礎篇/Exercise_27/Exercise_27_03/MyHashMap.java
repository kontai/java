package Java語言程序設計基礎篇.Exercise_27.Exercise_27_03;

import java.util.ArrayList;

public class MyHashMap<K, V> implements MyMap<K, V> {
	// Define the default hash-table size. Must be a power of 2
	private static int DEFAULT_INITIAL_CAPACITY = 4;

	// Define the maximum hash-table size. 1 << 30 is same as 2 ^ 30
	private static int MAMIMUM_CAPACITY = 1 << 30;

	// Current hash-table capacity. Capacity is a power of 2
	private int capacity;

	// Define default load factor
	private static float DEFAULT_MAX_LOAD_FACTOR = 0.5f;

	// Specify a load factor used in the hash table
	private float loadFactorThreshold;

	// The number of entries in the map
	private int size = 0;

	// Hash table is an ArrayList
	private ArrayList<MyMap.Entry<K, V>> table;

	/** Construct a map with the default capacity and load factor */
	public MyHashMap() {
		this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
	}

	/** Construct a map with the specified initial capacity and
	 * default load factor */
	public MyHashMap(int initialCapacity) {
		this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
	}

	/** Construct a map with the specified initial capacity
	 * and load factor */
	public MyHashMap(int initialCapacity, float loadFactorThreshold) {
		if (initialCapacity > MAMIMUM_CAPACITY)
			this.capacity = MAMIMUM_CAPACITY;
		else
			this.capacity = trimToPowerOf2(initialCapacity);

		this.loadFactorThreshold = loadFactorThreshold;
		table = new ArrayList<>();
		for (int i = 0; i < capacity; i++) {
			table.add(null);
		}
	}

	@Override /** Remove all of the entries from this map */
	public void clear() {
		size = 0;
		removeEntries();
	}

	@Override /** Return true if the specified key is in the map */
	public boolean containsKey(K key) {
		if (get(key) != null)
			return true;
		else
			return false;
	}

	@Override /** Return true if this map contains the value */
	public boolean containsValue(V value) {
		for (int i = 0; i < capacity; i++) {
			if (table.get(i) != null && 
				 table.get(i).getValue() == value)
				return true;
		}

		return false;
	}

	@Override /** Return a set of entries in the map */
	public java.util.Set<Entry<K, V>> entrySet() {
		java.util.Set<Entry<K, V>> set = new java.util.HashSet<>();

		for (int i = 0; i < capacity; i++) {
			if (table.get(i) != null) {
				set.add(table.get(i));
			}
		}

		return set;
	}

	@Override /** Return the value that matches the specified key */
	public V get(K key) {
		int hash1 = hash(key.hashCode());
		int index = hash1;
		int j = 0;

		while (table.get(index) != null) {
			if (table.get(index).getKey().equals(key)) {
				return table.get(index).getValue();
			}

			// Secondary hash: (k + j * h'(key)) % N
			index = hash1 + j++ * hash2(hash1); 
			index %= capacity;
		}

		return null;
	}

	@Override /** Return true if this map contains no entries */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override /** Return a set consisting of the keys in this map */
	public java.util.Set<K> keySet() {
		java.util.Set<K> set = new java.util.HashSet<>();

		for (int i = 0; i < capacity; i++) {
			if (table.get(i) != null)
				set.add(table.get(i).getKey());
		}

		return set;
	}

	@Override /** Add an entry (key, value) into the map */
	public V put(K key, V value) {
		int hash1 = hash(key.hashCode());
		int index = hash1;
		int j = 0;

		while (table.get(index) != null) {
			// The key is already in the map
			if (table.get(index).getKey().equals(key)) {
				Entry<K, V> entry = table.get(index);
				V oldValue = entry.getValue();
				// Replace old value with new value
				entry.value = value;
				table.set(index, entry);
				// Return the old value for the key
				return oldValue;
			}

			// Secondary hash: (k + j * h'(key)) % N
			index = hash1 + j++ * hash2(hash1); 
			index %= capacity;
		}

		// Check load factor
		if (size >= capacity * loadFactorThreshold) {
			if (capacity == MAMIMUM_CAPACITY)
				throw new RuntimeException("Exceeding maximum capacity");
			rehash();
		}

		// Add a new entry(key, value) to hashtable
		table.set(index, new MyMap.Entry<K, V>(key, value));

		size++; // Increase size;

		return value;
	}

	@Override /** Remove the entry for the specified key */
	public void remove(K key) {
		int hash1 = hash(key.hashCode());
		int index = hash1;
		int j = 0;

		// Remove the first entry that matched the key
		while (table.get(index) != null) {
			if (table.get(index).getKey().equals(key)) {
				table.remove(index);
				size--; // Decrease size
				break; // Remove just one entry that matches the key
			}

			// Secondary hash: (k + j * h'(key)) % N
			index = hash1 + j++ * hash2(hash1); 
			index %= capacity;
		}
	}

	@Override /** Return the number of entries in this map */
	public int size() {
		return size;
	}

	@Override /** Return a set consisting of values in this map */
	public java.util.Set<V> values() {
		java.util.Set<V> set = new java.util.HashSet<>();

		for (int i = 0; i < capacity; i++) {
			if (table.get(i) != null)
				set.add(table.get(i).getValue());
		}

		return set;
	}

	/** Hash function */
	private int hash(int hashCode) {
		return supplementalHash(hashCode) & (capacity - 1);
	}

	/** Ensure the hashing is evenly distributed */
	private static int supplementalHash(int h) {
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	/** Secondary hash function */
	private int hash2(int hash) {
		return (7 - hash) & (7 - 1);
	}

	/** Return a power of 2 for initialCapacity */
	private int trimToPowerOf2(int initialCapacity) {
		int capacity = 1;
		while (capacity < initialCapacity) {
			capacity <<= 1;
		}

		return capacity;
	}

	/** Remove all entries from map */
	private void removeEntries() {
		table.clear();
	}

	/** Rehash the map */
	private void rehash() {
		java.util.Set<Entry<K, V>> set = entrySet();
		capacity <<= 1; // Same as capacity *= 2. <= is more efficient
		size = 0; // Reset size
		table.clear();
		for (int i = 0; i < capacity; i++) 
			table.add(null);
		
		for (Entry<K, V> entry : set) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override /** Return a string repersentation of this map */
	public String toString() {
		StringBuilder builder = new StringBuilder("[");

		for (Entry<K, V> entry : table) {
			if (entry != null && table.size() > 0) {
				builder.append(entry);
			}
		}

		builder.append("]");
		return builder.toString();
	}
}