/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s128.longestconsecutivesequence;

import java.util.Arrays;

/**
 * 思路二：在思路一中，存在问题。第4步有的情况下不能找出最长串。可能需要合并。
 * 1、O（n）复杂度的排序，计数排序。（Arrays.sort是用的快排）
 * 
 * 
 * 
 * 思路一：需要O（n）的时间复杂度，所以不能进行排序。
 * 1、向磁铁一样，吸附两边的数。
 * 比如，先把100看成磁铁，那么它可以吸附的是99和101，以此类推。
 * 2、用一个计数器count来记录，有多少块磁铁。
 * 因为，所有的数字都有可能出现，所以不能用某个数字标记是否有效。
 * 3、最后，看磁铁的头尾，来计算这个磁铁吸附了多少个数。
 * 4、找到吸附了最多个数的磁铁，吸附的数的数量，就是最长连续串。
 * 
 * 注：使用两个与num长度相同的数组来存磁铁的两端。
 * 而不是使用num.length个长度为2的数组来存磁铁。
 * 内存的行优先存储，这样可以优化。
 * @author Xiaochutian
 */
public class Solution {
    public int longestConsecutive(int[] num) {
        //找到临时数组的长度
        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        int[] sorted = new int[num.length];
//        int[] count = new int[]
        return 0;
    }
    void radixSort(int[] num){
        
    }
}