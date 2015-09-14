/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s237.deletenodeinalinkedlist;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public void deleteNode(ListNode node) {
        //前后两个指针，把后一个节点的值赋给前一个
        ListNode tempNode = node;
        ListNode nextNode = node.next;
        //让nextNode指针，遍历到链表尾
        while(nextNode.next!=null){
            tempNode.val = nextNode.val;
            tempNode = nextNode;
            nextNode = nextNode.next;
        }
        //把最后一个节点的值，赋给倒数第二个节点，再把最后一个节点删掉
        tempNode.val = nextNode.val;
        tempNode.next = null;
    }
}