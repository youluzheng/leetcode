package cn.youluzheng.leetcode.哈希表;

public class P383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            map[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
