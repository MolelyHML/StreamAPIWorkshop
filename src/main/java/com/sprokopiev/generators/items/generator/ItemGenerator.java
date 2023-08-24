package com.sprokopiev.generators.items.generator;

import com.sprokopiev.generators.items.model.Item;

import java.util.*;

public class ItemGenerator {
    private final static String[] itemNames = {"Porridge", "Iphone", "Umbrella", "Sausage", "Coffee", "Bag", "Keyboard", "Pen", "Pencil", "Glue",
    "Table", "Shoes", "Glasses", "Telescope", "Window", "Door", "Earphones", "Honey"};
    private static Random rand = new Random();

    public static List<Item> generateItemsArrayList(int size) {
        List<Item> items = new ArrayList<>();
        for(int i = 0; i <= size; i++)
            items.add(new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }
    public static List<Item> generateItemsLinkedList(int size) {
        List<Item> items = new LinkedList<>();
        for(int i = 0; i <= size; i++)
            items.add(new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }

    public static Set<Item> generateItemsHashSet(int size) {
        Set<Item> items = new HashSet<>();
        for(int i = 0; i <= size; i++)
            items.add(new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }

    public static Set<Item> generateItemsLinkedHashSet(int size) {
        Set<Item> items = new LinkedHashSet<>();
        for(int i = 0; i <= size; i++)
            items.add(new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }

    public static Map<Integer, Item> generateItemsHashMap(int size) {
        Map<Integer, Item> items = new HashMap<>();
        for(int i = 0; i <= size; i++)
            items.put(i, new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }

    public static Map<Integer, Item> generateItemsLinkedHashMap(int size) {
        Map<Integer, Item> items = new LinkedHashMap<>();
        for(int i = 0; i <= size; i++)
            items.put(i, new Item(itemNames[rand.nextInt(18)], rand.nextDouble(100), rand.nextDouble(200)));
        return items;
    }
}
