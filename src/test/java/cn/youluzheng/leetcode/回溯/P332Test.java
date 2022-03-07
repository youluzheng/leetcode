package cn.youluzheng.leetcode.回溯;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class P332Test {

    @Test
    void findItinerary() {
        List<List<String>> input = new LinkedList<>() {{
            add(List.of("JFK", "SFO"));
            add(List.of("JFK", "ATL"));
            add(List.of("SFO", "ATL"));
            add(List.of("ATL", "JFK"));
            add(List.of("ATL", "SFO"));
        }};
        List<String> actual = new P332().findItinerary(input);
        System.out.println(actual);
    }

    @Test
    void findItinerary2() {
        List<List<String>> input = new LinkedList<>() {{
            add(List.of("JFK", "KUL"));
            add(List.of("JFK", "NRT"));
            add(List.of("NRT", "JFK"));
        }};
        List<String> actual = new P332().findItinerary(input);
        System.out.println(actual);
    }
}