// HashSet with own methods to store elements
package com.set;

import java.util.HashSet;
import java.util.Set;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to set
        set.add("Germany");
        set.add("Czech");
        set.add("Poland");
        set.add("USA");
        set.add("Korea");
        set.add("Egypt");

        // Printing elements of set to console
        System.out.println(set);

        // Trying to add duplicate with value "Egypt"
        set.add("Egypt");

        // Printing elements of set to console to check if Egypt is there twice
        System.out.println(set); // Element is met only once

        // Coping elements of set to another set and printing
        HashSet<String> set1 = new HashSet<>();
        set1.addAll(set);
        System.out.println(set1);

        // Checking if set is empty with true/false answer
        System.out.println(set.isEmpty());

        // Removing all elements from set
       set.clear();

        // Checking if set is empty with true/false answer
        System.out.println(set.isEmpty());

        // Printing size of set
        System.out.println(set.size());

        // Coping elements of one set to another
        HashSet<String> set2= new HashSet<>();
        set2 = set1;

        // Printing elements of the set to console
        System.out.println(set2);
    }
}