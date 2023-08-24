package com.sprokopiev.generators.person.generator;

import com.sprokopiev.generators.person.model.Person;
import com.sprokopiev.generators.person.model.Profession;

import java.util.*;

public class PersonGenerator {

    private static final String[] firstNames = {"James", "Mary", "Robert", "Patricia", "John", "Jennifer", "Michael", "Linda", "David", "Elizabeth", "William", "Barbara", "Richard",
    "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Christopher", "Karen", "Charles", "Lisa", "Daniel", "Nancy", "Matthew", "Betty", "Anthony", "Sandra", "Mark", "Margaret"};

    private static final String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez",
    "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson"};

    public static Set<Person> generatePersonsHashSet(int size) {
        Random rand = new Random();
        Set<Person> hashSet = new HashSet<>();
        for(int i = 0; i <= size; i++)
            hashSet.add(new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return hashSet;
    }

    public static Set<Person> generatePersonsLinkedHashSet(int size) {
        Random rand = new Random();
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        for(int i = 0; i <= size; i++)
            linkedHashSet.add(new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return linkedHashSet;
    }
    public static List<Person> generatePersonsLinkedList(int size) {
        Random rand = new Random();
        List<Person> linkedList  = new LinkedList<>();
        for(int i = 0; i <= size; i++)
            linkedList.add(new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return linkedList;
    }

    public static List<Person> generatePersonsArrayList(int size) {
        Random rand = new Random();
        List<Person> arrayList  = new ArrayList<>();
        for(int i = 0; i <= size; i++)
            arrayList.add(new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return arrayList;
    }

    public static Map<Integer, Person> generatePersonsHashMap(int size) {
        Random rand = new Random();
        Map<Integer, Person> hashMap = new HashMap<>();
        for(int i = 0; i <= size; i++)
            hashMap.put(i, new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return hashMap;
    }

    public static Map<Integer, Person> generatePersonsLinkedHashMap(int size) {
        Random rand = new Random();
        Map<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0; i <= size; i++)
            linkedHashMap.put(i, new Person(firstNames[rand.nextInt(30)], lastNames[rand.nextInt(30)],rand.nextInt(100),
                    Profession.getRandomProfession()));
        return linkedHashMap;
    }
}
