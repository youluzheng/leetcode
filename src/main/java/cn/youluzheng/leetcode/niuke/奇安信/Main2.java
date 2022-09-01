package cn.youluzheng.leetcode.niuke.奇安信;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String str = in.nextLine();
        String[] strs = str.substring(1, str.length() - 1).split(",");
        for (String s : strs) {
            list.add(Integer.valueOf(s));
        }
        int max = Math.min(list.get(0), list.get(1));
        int index1 = 0;
        int index2 = 1;
        for (int i = 2; i < list.size(); i++) {
            int size1 = (i - index1) * Math.min(list.get(index1), list.get(i));
            int size2 = (i - index2) * Math.min(list.get(index2), list.get(i));
            if (size1 > size2) {
                if (size1 > max) {
                    max = size1;
                    index2 = i;
                }
            } else {
                if (size2 > max) {
                    index1 = index2;
                    index2 = i;
                }
            }
        }
        System.out.println(max);
    }
}
