package cn.youluzheng.leetcode.链表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P707Test {

    @Test
    void testAddAtHead() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.print();
    }

    @Test
    void testAddAtTail() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.print();
    }

    @Test
    void testAddAtIndex() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        list.addAtIndex(-1, 1);
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 3);
        list.addAtIndex(0, 2);
        list.print();
    }

    @Test
    void testGet() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        assertEquals(-1, list.get(0));
        list.addAtTail(1);
        assertEquals(1, list.get(0));
        assertEquals(-1, list.get(1));
    }

    @Test
    void testDeleteAtIndex() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.deleteAtIndex(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        list.deleteAtIndex(0);
        assertEquals(2, list.get(0));
    }

    @Test
    void test() {
        P707.MyLinkedList list = new P707.MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        list.print();
        assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        list.print();
        assertEquals(3, list.get(1));
    }
}