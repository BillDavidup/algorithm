package com.david.learn.algorithm.list;

/**
 * 单向链表的每一个val组成的数字链表加法运算
 * 例：9->9->9->9-> + 1 = 10000
 * 思想：先单链表反转后遍历，与10取余保存value，与10商加到后面节点中
 */
public class ListAddNum {
    // 定义单向链表
    static class ListNode {
        Integer val;
        ListNode next;

        public ListNode(Integer val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode l = init();
        print(l);
        //ListNode n = reverse(l);
        //print(n);
        print(listAddNum(l, 11));

    }

    public static ListNode listAddNum(ListNode root, Integer num) {
        if (null == root) {
            return null;
        }
        ListNode reversedL = reverse(root);
        ListNode temp = reversedL;
        ListNode tail = null;
        boolean firstAddFlag = true;
        int nextAdd = 0;
        while (null != temp) {
            int value = temp.val;
            if (firstAddFlag) {
                value = value + num;
                firstAddFlag = false;
            } else {
                value = value + nextAdd;
            }
            temp.val = value % 10;
            nextAdd = value / 10;
            tail = temp;
            temp = temp.next;
        }
        // 尾结点怎么处理
        if (null == temp) {
            while (nextAdd % 10 != 0) {
                ListNode n = new ListNode(nextAdd % 10);
                tail.next = n;
                tail = n;
                nextAdd = nextAdd / 10;
            }
        }
        return reverse(reversedL);
    }

    // 单向链表翻转
    private static ListNode reverse(ListNode root) {
        if (null == root || root.next == null) {
            return root;
        }
        ListNode temp = root;
        ListNode order = null;
        while (null != temp) {
            // 先保存当前temp节点的子链表
            ListNode n = temp.next;
            // 当前节点指向已经排序好的order链表
            temp.next = order;
            // 当前节点已经排好序，赋值非order节点
            order = temp;
            // 修改循环条件条件
            temp = n;
        }
        return order;
    }

    private static ListNode init() {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(9);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }

    private static void print(ListNode root) {
        ListNode temp = root;
        while (null != temp) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("");
    }
}
