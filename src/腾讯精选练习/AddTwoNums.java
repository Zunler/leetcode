/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AddTwoNums
 * Author:   pengzijun
 * Date:     2019/9/28 8:57 下午
 * Description: 两数相加
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br>
 * 〈两数相加〉
 *
 * @author pengzijun
 * @create 2019/9/28
 * @since 1.0.0
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNums {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size=1000;
        int[] list1 = new int[size];
        int[] list2 = new int[size];
        int[] result = new int[size];
        //初始化数组
        for (int j = 0; j < size; j++) {
            list1[j] = 0;
            list2[j] = 0;
            result[j] = 0;
        }
        //读取数组
        int i = 0;
        while (l1 != null) {
            list1[i] = l1.val;
            l1 = l1.next;
            i++;

        }
        int k = 0;
        while (l2 != null) {
            list2[k] = l2.val;
            l2 = l2.next;
            k++;
        }
        //补零

//        int max;
//        if (k > i) {
//            for (int j = i; j < k; j++) {
//                list1[j] = 0;
//
//            }
//            max = k;
//        } else {
//            for (int j = k; j < i; j++) {
//                list2[j] = 0;
//
//            }
//            max = i;
//        }
        //相加

        int max = (k > i ? k : i);
        for (int j = 0; j <=max; j++) {
            int ben = (list1[j] + list2[j]+result[j]) % 10;
            int jin = (list1[j] + list2[j]+result[j]) / 10;
            result[j] = ben;
            result[j + 1] = jin;


        }
        ListNode root = new ListNode(result[0]);
        ListNode current = root;

        for (int j = 1; j <= max; j++) {

            if (!(result[j] == 0 && j == max)) {
                ListNode newNode = new ListNode(result[j]);
                current.next = newNode;
                current = newNode;
            }
        }
//        for (int j = 0; j <= max; j++) {
//
//            if (!(result[j] == 0 && j == max)) {
//                System.out.println(result[j]);
//            }
//
//        }
        return root;


    }

    public static void main(String[] args) {
        int[] list1 = {1 };
        int[] list2 = {9,9};
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        ListNode current = l1;
        for (int i = 1; i < list1.length; i++) {
            ListNode newNode = new ListNode(list1[i]);
            current.next = newNode;
            current = newNode;
        }
        current = l2;
        for (int i = 1; i < list2.length; i++) {
            ListNode newNode = new ListNode(list2[i]);
            current.next = newNode;
            current = newNode;
        }
        current = l2;
        while (current != null) {
            // System.out.println(current.val);
            current = current.next;
        }
        AddTwoNums addTwoNums = new AddTwoNums();
        addTwoNums.addTwoNumbers(l1, l2);
    }
}