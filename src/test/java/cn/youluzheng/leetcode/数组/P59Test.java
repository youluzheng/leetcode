package cn.youluzheng.leetcode.数组;

import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.IntegerConversion;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P59Test {

    boolean isEqualsTo(List<Integer> source, int[] target){
        if(source.size() != target.length){
            return false;
        }
        for(int i=0;i<source.size();i++){
            if(source.get(i) != target[i]){
                return false;
            }
        }
        return true;
    }

    @Test
    void generateMatrix() {
        int input = 3;
        int[][] actual = P59.generateMatrix(input);
        assertTrue(this.isEqualsTo(List.of(1, 2, 3), actual[0]));
        assertTrue(this.isEqualsTo(List.of(8, 9, 4), actual[1]));
        assertTrue(this.isEqualsTo(List.of(7, 6, 5), actual[2]));
    }

    @Test
    void generateMatrix2() {
        int input = 1;
        int[][] actual = P59.generateMatrix(input);
        assertTrue(this.isEqualsTo(List.of(1), actual[0]));
    }

    @Test
    void generateMatrix3() {
        int input = 5;
        int[][] actual = P59.generateMatrix(input);
        PrintUtil.print(actual);
    }
}