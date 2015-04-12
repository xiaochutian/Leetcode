/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s27.removeelements;

import java.util.ArrayList;

/**
 * 返回的length用于，标识数组A中有多少有效的元素。
 * @author Xiaochutian
 */
public class Solution {
    public int removeElement(int[] A, int elem) {
        int[] B = new int[A.length];
        int elemCount = 0;
        int indexB = 0;
        for(int i :A){
            if(i==elem){
                elemCount++;
            }else{
                B[indexB] = i;
                indexB++;
            }
        }
        //酱紫的赋值是不会影响函数外面的值的，需要，修改A里面的，各个元素的值。
        //A=B;
        for(int i=0;i<B.length;i++){
            A[i]=B[i];
        }
        return A.length-elemCount;
    }
}