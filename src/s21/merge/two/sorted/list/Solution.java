/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s21.merge.two.sorted.list;

/**
 * 假设为两个sorted　list为升序排列
 *
 * @author Xiaochutian
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //ps为“第一个节点”较小，的链表的剩余节点的头结点（用于保存链表的剩余部分）
        //pb为“第一个节点”较大，的链表的剩余节点的头结点（用于保存链表的剩余部分）
        //head为合并后链表的头指针（头节点）
        //pt为合并后链表的，index指针
        ListNode ps = null, pb = null, pt = null, head = null;
        if (l1.val <= l2.val) {
            head = pt = ps = l1;
            pb = l2;
        } else {
            head = pt = ps = l2;
            pb = l1;
        }

        ps = ps.next;
        while (ps != null && pb != null) {
            while (ps != null && pb != null && ps.val <= pb.val) {
                pt.next = ps;
                pt = pt.next;
                ps = ps.next;
            }
            while (ps != null && pb != null && pb.val <= ps.val) {
                pt.next = pb;
                pt = pt.next;
                pb = pb.next;
            }
        }
        
        if(ps==null){
            pt.next = pb;
        }else{
            pt.next = ps;
        }
        
        return head;
    }
}
