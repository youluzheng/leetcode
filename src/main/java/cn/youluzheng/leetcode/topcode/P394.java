package cn.youluzheng.leetcode.topcode;

public class P394 {

    int decode(String s, int count, int index, StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder();
        int num = 0;
        for (; index < s.length(); index++) {
            if (s.charAt(index) <= 'z' && s.charAt(index) >= 'a') {
                sb1.append(s.charAt(index));
            } else if (s.charAt(index) <= '9' && s.charAt(index) >= '0') {
                num = num * 10 + s.charAt(index) - '0';
            } else if (s.charAt(index) == '[') {
                index = decode(s, num, index + 1, sb1);
                num = 0;
            } else {
                break;
            }
        }
        while (count-- != 0) {
            sb.append(sb1);
        }
        return index;
    }

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        decode(s, 1, 0, sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        P394 p394 = new P394();
        System.out.println(p394.decodeString("3[a]2[bc]"));
        System.out.println(p394.decodeString("3[a2[c]]"));
        System.out.println(p394.decodeString("a1[a2[b3[c4[d]e]f]g]h"));
    }
}
