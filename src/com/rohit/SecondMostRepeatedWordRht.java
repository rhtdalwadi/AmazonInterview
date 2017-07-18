package com.rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SecondMostRepeatedWordRht {

  static SecondMostRepeatedWordRht ob = null;

  public static void main(String args[]) {
    ob = new SecondMostRepeatedWordRht();

    String[] input = {"ccc", "aaa", "ccc", "ddd", "aaa", "aaa", "ddd", "ddd", "ddd"};

    List<String> result = ob.getMostRepeatedWords(input);
    System.out.println(result.get(1));
  }


  public List<String> getMostRepeatedWords(String[] words) {
    Map<String, Integer> map = new HashMap<>();

    for (String word : words)
      map.put(word, map.containsKey(word) ? map.get(word) + 1 : 0);

    List<Entry<String, Integer>> tmp = new ArrayList<>(map.entrySet());
    Collections.sort(tmp, (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

    return tmp.stream().map(e -> e.getKey()).collect(Collectors.toList());
  }

}
