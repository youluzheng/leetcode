package cn.youluzheng.leetcode.topcode;

public class P468 {

    boolean isIpv4(String s) {
        if (s.length() > 3 || s.length() == 0) {
            return false;
        }
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + s.charAt(i) - '0';
        }
        return num >= 0 && num <= 255;
    }

    boolean isIpv6(String s) {
        if (s.length() == 0 || s.length() > 4) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'a' && s.charAt(i) <= 'f'
                    || s.charAt(i) >= 'A' && s.charAt(i) <= 'F') {
                continue;
            }
            return false;
        }
        return true;
    }

    public String validIPAddress(String queryIP) {
        if (queryIP.endsWith(".") || queryIP.endsWith(":")) {
            return "Neither";
        }
        String[] strings = queryIP.split("\\.");
        if (strings.length == 4) {
            if (isIpv4(strings[0]) && isIpv4(strings[1]) && isIpv4(strings[2]) && isIpv4(strings[3])) {
                return "IPv4";
            }
            return "Neither";
        }
        strings = queryIP.split(":");
        if (strings.length == 8) {
            for (int i = 0; i < 8; i++) {
                if (!isIpv6(strings[i])) {
                    return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }

    public static void main(String[] args) {
        P468 p468 = new P468();
        System.out.println(p468.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }
}
