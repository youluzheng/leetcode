package cn.youluzheng.leetcode.回溯;

import java.util.*;

public class P332 {

    Map<String, Map<String, Integer>> map = new HashMap<>();

    List<String> result;

    void buildMap(List<List<String>> tickets) {
        for (var list : tickets) {
            Map<String, Integer> end = map.get(list.get(0));
            if (end != null) {
                end.put(list.get(1), end.getOrDefault(list.get(1), 0) + 1);
            } else {
                map.put(list.get(0), new TreeMap<>() {{
                    put(list.get(1), 1);
                }});
            }
        }
    }

    void find(int k, String start, Map<String, Integer> city, List<String> temp) {
        if (k == 0) {
            result = new LinkedList<>(temp);
            return;
        } else if (result != null) {
            return;
        }
        if (city == null) {
            return;
        }
        for (String key : city.keySet()) {
            if (city.get(key) != 0) {
                city.put(key, city.get(key) - 1);
                temp.add(key);
                find(k - 1, key, map.get(key), temp);
                temp.remove(temp.size() - 1);
                city.put(key, city.get(key) + 1);
            }
        }
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        buildMap(tickets);
        find(tickets.size(), "JFK", map.get("JFK"), new ArrayList<>() {{
            add("JFK");
        }});
        return result;
    }

    static class node {
        String name;
    }

    public List<String> findItinerary2(List<List<String>> tickets) {
        buildMap(tickets);
        find(tickets.size(), "JFK", map.get("JFK"), new ArrayList<>() {{
            add("JFK");
        }});
        return result;
    }
}
