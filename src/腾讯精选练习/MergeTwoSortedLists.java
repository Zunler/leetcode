/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MergeTwoSortedLists
 * Author:   pengzijun
 * Date:     2019/10/9 9:01 上午
 * Description: 合并两个有序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序链表〉
 *
 * @author pengzijun
 * @create 2019/10/9
 * @since 1.0.0
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode current;
//        if(l1==null&&l2!=null){
//            return l2;
//        }
//        else if(l1!=null&l2==null){
//            return  l1;
//
//        }
//        else if(l2==null&&l2==null){
//            return  null;
//        }
//        if(l1.val<=l2.val){
//            root=new ListNode(l1.val);
//            l1=l1.next;
//        }
//        else {
//            root=new ListNode(l2.val);
//            l2=l2.next;
//        }
        current=root;
        while(!(l1==null&&l2==null)){
            if(l1==null){
                current.next=l2;
                break;
            }
            else if(l2==null){
                current.next=l1;
                break;
            }
            if(l1.val<l2.val){
                current.next=new ListNode(l1.val);
                l1=l1.next;

            }
            else{
                current.next=new ListNode(l2.val);
                l2=l2.next;

            }
    current=current.next;

        }

    return root.next;
    }

    public static void main(String[] args) {
        int[] list1 = {1,2,4};
        int[] list2 = {1,3,4};
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
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
        MergeTwoSortedLists mergeTwoSortedLists=new MergeTwoSortedLists();
        ListNode a;
        ListNode b;
        ListNode root=mergeTwoSortedLists.mergeTwoLists(l1,l2);
        while(root!=null){
            System.out.println(root.val);
            root=root.next;
        }



    }
}