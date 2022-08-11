package cn.youluzheng.leetcode.other;

import java.util.ArrayList;
import java.util.List;

public class P1417 {
    public static String reformat(String s) {
        List<Character> nums = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        int numCount = 0;
        int charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numCount++;
                nums.add(s.charAt(i));
            } else {
                charCount++;
                chars.add(s.charAt(i));
            }
        }
        if (Math.abs(numCount - charCount) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (numCount > charCount) {
            int i = 0;
            while (i < charCount) {
                sb.append(nums.get(i)).append(chars.get(i));
                i++;
            }
            if (i != numCount) {
                sb.append(nums.get(i));
            }
        } else {
            int i = 0;
            while (i < numCount) {
                sb.append(chars.get(i)).append(nums.get(i));
                i++;
            }
            if (i != charCount) {
                sb.append(chars.get(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        assert reformat("123456").equals("") : 1;
        assert reformat("abcde").equals("") : 1;
        assert reformat("abc123").equals("a1b2c3") : 1;
        assert reformat("abc12").equals("a1b2c") : 1;
        assert reformat("abc1234").equals("1a2b3c4") : 1;
        assert reformat("abc12345").equals("") : 1;
    }
}
