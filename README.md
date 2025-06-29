# Design-HashMap
Leetcode Problem #706. Design a HashMap without using an HashMap components.

# MyHashMap

## Description

This project implements a basic `HashMap` data structure without using any built-in hash table libraries. The `MyHashMap` class provides the following operations:

- `put(key, value)`: Insert or update a key-value pair.
- `get(key)`: Retrieve the value associated with a key.
- `remove(key)`: Remove the key-value pair if it exists.

### `MyHashMap()`
Initializes an empty hash map.

### `void put(int key, int value)`
Inserts a `(key, value)` pair into the map.  
If the key already exists, update the corresponding value.

### `int get(int key)`
Returns the value to which the specified key is mapped,  
or `-1` if this map contains no mapping for the key.

### `void remove(int key)`
Removes the mapping for the specified key if it exists.
