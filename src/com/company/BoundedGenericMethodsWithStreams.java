package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class BoundedGenericMethodsWithStreams {

  public static <E, C extends Collection<E>> Optional<C> getSmallestCollection(List<C> collections){
    return collections.stream()
        .reduce((x,y) -> (x.size() < y.size()) ? x : y);
  }

  public static void main(String[] args) {
    final Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2));
    final Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s4 = new HashSet<>(Arrays.asList(3, 4));

    final List<String> l1 = new ArrayList<>(Arrays.asList("alpha", "beta", "gamma"));
    final List<String> l2 = new ArrayList<>(Arrays.asList("ay", "bee", "cee"));
    final List<String> l3 = new ArrayList<>(Arrays.asList("mouse", "fox", "owl", "snake",
        "gruffalo"));
    final List<String> l4 = new ArrayList<>(Arrays.asList("dog", "cat", "frog", "bird", "witch",
        "broomstick"));
    final List<String> l5 = new ArrayList<>(Arrays.asList("dragon", "pox"));
    final List<String> l6 = new ArrayList<>(Arrays.asList("dragon", "pox"));

    final List<Set<Integer>> listOfSetsOfIntegers = Arrays.asList(s1, s2, s3, s4);
    final List<List<String>> listOfListsOfStrings = Arrays.asList(l1, l2, l3, l4, l5, l6);

    final List<Collection<?>> listOfCollections = Arrays.asList(s1, s2, s3, s4, l1, l2, l3, l4, l5);

    final Optional<Set<Integer>> smallestSet = getSmallestCollection(listOfSetsOfIntegers);
    assert smallestSet.isPresent();
    assert smallestSet.get().size() == 2;

    final Optional<List<String>> smallestList = getSmallestCollection(listOfListsOfStrings);
    assert smallestList.isPresent();
    assert smallestList.get().equals(l5);

  }
}
