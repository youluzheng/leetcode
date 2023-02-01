package cn.youluzheng.leetcode.daily;

public class P2325 {
    public static String decodeMessage(String key, String message) {
        int index = 0;
        int[] chs = new int[26];
        int[] dup = new int[26];
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }
            int k = key.charAt(i) - 'a';
            if (dup[k] == 0) {
                chs[key.charAt(i) - 'a'] = index++;
                dup[k] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }
            sb.append((char) (chs[message.charAt(i) - 'a'] + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
