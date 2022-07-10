package cn.youluzheng.leetcode.周赛.n300;

public class P6108 {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }
            if (map[key.charAt(i) - 'a'] != 0) {
                continue;
            }
            map[key.charAt(i) - 'a'] = (char) ('a' + count);
            count++;
            if (count == 26) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                sb.append(map[message.charAt(i) - 'a']);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = new P6108().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
        System.out.println(s);
    }
}
