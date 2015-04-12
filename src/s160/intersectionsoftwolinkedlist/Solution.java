/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s160.intersectionsoftwolinkedlist;

/**
 * 要求链表必须保持原来的结构，就不能把两个链表当左值
 * @author Xiaochutian
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode indexA = headA;
        ListNode indexB = headB;
        while(indexA!=null){
            lengthA++;
            indexA = indexA.next;
        }
        while(indexB!=null){
            lengthB++;
            indexB = indexB.next;
        }
        int sub = lengthA - lengthB; 
        indexA = headA;
        indexB = headB;
        if(sub>0){
            for(int i=0;i<sub;i++)
                indexA = indexA.next;
        }else if(sub<0){
            sub = -sub;
            for(int i=0;i<sub;i++)
                indexB = indexB.next;
        }
        while(indexA!=null){
            if (indexA.val==indexB.val) {
                return indexA;
            }else{
                indexA = indexA.next;
                indexB = indexB.next;
            }
        }
        return null;
    }
}