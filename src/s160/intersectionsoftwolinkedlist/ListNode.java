/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s160.intersectionsoftwolinkedlist;

/**
 *
 * @author Xiaochutian
 */
public class ListNode {
      int val;
      ListNode next;
      public ListNode(int x) {
          val = x;
          next = null;
      }
      public ListNode(int[] a){
          ListNode index = this;
          if(a!=null&&a.length!=0){
              index.val = a[0];
              for(int i=1;i<a.length;i++){
                  index.next = new ListNode(a[i]);
                  index = index.next;
              }
          }
      }
}
