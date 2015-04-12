/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2.addtwonumbers;

/**
 *
 * @author XiaoChutian-BUPT
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /**
         * 首先判断边界情况：
         * 如果l1为空，则返回l2。
         * 如果l2为空，则返回l1。
         * 如果都为空，则返回null。
         */
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        /**
         * 保存临时变量，则不改变l1，l2的结构。
         * 这一步做初始化，相当于for循环里面的int i=0；
         */
        ListNode t1 = l1;                   //l1的index指针
        ListNode t2 = l2;                   //l2的index指针
        int add = t1.val + t2.val;          //当前位的和
        int sw = add / 10;                  //当前位的和的十位
        int gw = add % 10;                  //当前位的和的个位
        ListNode result = new ListNode(gw);
        ListNode resultIndex = result;

        //第一版的resultIndex忘记移动了，所以结果出错了。
        //在resultIndex.next = new ListNode(gw);之后添加resultIndex=resultIndex.next;
        
        /**
         * 两个数重叠的部分相加
         */
        while (t1.next != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next;
            add = t1.val + t2.val + sw;
            sw = add / 10;
            gw = add % 10;
            resultIndex.next = new ListNode(gw);
            resultIndex=resultIndex.next;
        }
        
        /**
         * 加上某个较长的数的剩下部分
         */
        while(t1.next!=null){
            t1=t1.next;
            add = t1.val+sw;
            sw = add/10;
            gw = add%10;
            resultIndex.next = new ListNode(gw);
            resultIndex=resultIndex.next;
        }
        while(t2.next!=null){
            t2=t2.next;
            add = t2.val+sw;
            sw =add/10;
            gw =add%10;
            resultIndex.next = new ListNode(gw);
            resultIndex=resultIndex.next;
        }
        
        /**
         * 最后，如果十位不为0，则再加上十位
         */
        if(sw!=0){
            resultIndex.next = new ListNode(sw);
        }
        return result;
    }
}
