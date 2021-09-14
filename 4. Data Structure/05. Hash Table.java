// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        HashTable map = new HashTable();
        map.put(6, "A");
        map.put(8, "D");
        map.put(11, "C");
        System.out.println(map.get(6));
    }
}

// ARRAY CLASS

package com.alainafonso;

import java.util.Arrays;

public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private Entry[] entries = new Entry[5];
    private int count;

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        if (isFull())
            throw new IllegalStateException();

        entries[getIndex(key)] = new Entry(key, value);
        count++;
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    public void remove(int key) {
        var index = getIndex(key);
        if (index == -1 || entries[index] == null)
            return;

        entries[index] = null;
        count--;
    }

    public int size() {
        return count;
    }

    private Entry getEntry(int key) {
        var index = getIndex(key);
        return index >= 0 ? entries[index] : null;
    }

    private int getIndex(int key) {
        int steps = 0;

        // Linear probing algorithm: we keep looking until we find an empty
        // slot or a slot with the same key.

        // We use this loop conditional to prevent an infinite loop that
        // will happen if the array is full and we keep probing with no
        // success. So, the number of steps (or probing attempts) should
        // be less than the size of our table.
        while (steps < entries.length) {
            int index = index(key, steps++);
            var entry = entries[index];
            if (entry == null || entry.key == key)
                return index;
        }

        // This will happen if we looked at every slot in the array
        // and couldn't find a place for this key. That basically means
        // the table is full.
        return -1;
    }

    private boolean isFull() {
        return count == entries.length;
    }

    private int index(int key, int i) {
        return (hash(key) + i) % entries.length;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}


// JAVA BUILTIN HASH MAP IMPLEMENTATION

package com.alainafonso;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       // key: Employee Number - integer
     // Value: Employee Name - String
        
     // Map<key, value>
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alain");
        map.put(2, "Geovany");
        map.put(3, "Fernando");
        map.remove(3);
        map.get(1);
        System.out.println(map);

        // We can iterate over Hash Map only through these 2 following methods: entrySet(), keySet()
        for(var item : map.entrySet())
            System.out.println(item);
    }
}


// We cannot iterate over a Hash Map. Hash Map don't allow duplicate keys, but it allows null key and value.