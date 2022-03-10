package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(List.of(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(List.of(0, 1, 2));
        System.out.println(set);
        System.out.println(set2);
        System.out.println( "Symmetric difference\n" + symmetricDifference(set,set2));
    }

    public static Set<Integer> symmetricDifference (Set<Integer> set, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set);
        newSet.removeAll(set2);
        set2.removeAll(set);
        newSet.addAll(set2);
        return newSet;
    }
}
