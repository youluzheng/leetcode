package cn.youluzheng.leetcode.回溯;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class P93Test {

    @Test
    void testSubString() {
        String s = "hello";
        String sub = s.substring(s.length());
        assertEquals("", sub);
        assertThrows(IndexOutOfBoundsException.class, () -> s.substring(s.length() + 1));
    }

    @Test
    void testRestoreIpAddresses() {
        List<String> actual = new P93().restoreIpAddresses("25525511135");
    }

    @Test
    void testRestoreIpAddresses1() {
        List<String> actual = new P93().restoreIpAddresses("0000");
    }

}