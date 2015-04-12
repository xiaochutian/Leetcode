/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s88.mergesortedarray;

/**
 * 假设为升序
 *
 * @author XiaoChutian-BUPT
 */
public class Solution {

    //第一版中，里层while()只有一个边界值判断。如果，通过了一个，但是另一个为空，则RTE
    public void merge(int A[], int m, int B[], int n) {
        int[] arr = new int[m + n];

        int ia = 0;
        int ib = 0;
        int ir = 0;

        while (true) {
            //A还没到末端，且A的当前节点 <= B的当前节点
            while (ia < m && ib < n && A[ia] <= B[ib]) {
                arr[ir] = A[ia];
                ia++;
                ir++;
            }
            //A到末端导致的跳出循环。则跳出外层的while，把剩下的B写入结果数组arr
            if (ia == m) {
                break;
            }
            //B还没到末端，且B的当前节点 <= A的当前节点
            while (ib < n && ia < m && B[ib] <= A[ia]) {
                arr[ir] = B[ib];
                ib++;
                ir++;
            }
            //B的末端导致的跳出循环。则跳出外层的while，把剩下的A写入结果数组arr
            if (ib == n) {
                break;
            }
        }
        if (ia == m) {
            for (int i = ib; i < n; i++) {
                arr[ir] = B[i];
                ir++;
            }
        } else {
            for (int i = ia; i < m; i++) {
                arr[ir] = A[i];
                ir++;
            }
        }
        //把结果数组的值赋给A
        for (int i = 0; i < arr.length; i++) {
            A[i] = arr[i];
        }
    }

    /*Runtime Error Message:	Line 12: java.lang.ArrayIndexOutOfBoundsException: 0
     Last executed input:	[1], []
     public void merge(int A[], int m, int B[], int n) {
     int[] arr = new int[m + n];

     int ia = 0;
     int ib = 0;
     int ir = 0;

     while (true) {
     //A还没到末端，且A的当前节点 <= B的当前节点
     while (ia < m && A[ia] <= B[ib]) {
     arr[ir] = A[ia];
     ia++;
     ir++;
     }
     //A到末端导致的跳出循环。则跳出外层的while，把剩下的B写入结果数组arr
     if (ia == m) {
     break;
     }
     //B还没到末端，且B的当前节点 <= A的当前节点
     while (ib < n && B[ib] <= A[ia]) {
     arr[ir] = B[ib];
     ib++;
     ir++;
     }
     //B的末端导致的跳出循环。则跳出外层的while，把剩下的A写入结果数组arr
     if (ib == n) {
     break;
     }
     }
     if (ia == m) {
     for (int i = ib; i < n; i++) {
     arr[ir] = B[i];
     ir++;
     }
     } else {
     for (int i = ia; i < m; i++) {
     arr[ir] = B[i];
     ir++;
     }
     }
     //把结果数组的值赋给A
     for (int i = 0; i < arr.length; i++) {
     A[i] = arr[i];
     }
     }*/
}
