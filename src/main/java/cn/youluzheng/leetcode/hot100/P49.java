package cn.youluzheng.leetcode.hot100;

import java.util.*;

public class P49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chs = strs[i].toCharArray();
            Arrays.sort(chs);
            String s = new String(chs);
            if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            } else {
                int index = i;
                map.put(s, new ArrayList<>() {{
                    add(strs[index]);
                }});
            }
        }
        return new ArrayList<>(map.values());
    }
}
