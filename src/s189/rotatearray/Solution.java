/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s189.rotatearray;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    //第一种，使用跟nums相同大小的辅助存储空间。
//    public void rotate(int[] nums, int k) {
//        int[] temp = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            temp[(i+k)%nums.length] = nums[i];
//        }
//        for(int i=0;i<nums.length;i++){
//            nums[i] = temp[i];
//        }
//    }
    //第二种，使用一个存储空间，每一次移动一位，移动k次
    
    /**
     * 第三种，使用一个存储空间。原来第index个位置的元素，
     * 需要放到第(index+k)%nums.length个位置
     * 
     * 于是，先把第(index+k)%nums.length个位置的元素取出来，放到temp里面，再覆盖，
     * 从index=0开始，这样进行nums.length-1次。最后，再把temp的值写入index=0的位置。
    */
    public void rotate(int[] nums, int k) {
        /**
         * 用例未通过：Input: [1], 0 Output:[0] Expected: [1] 
         * 于是添加如下代码
         */
        if(k==0)
            return;
        /**
         * 用例未通过：Input: [1], 1 Output: [0] Expected: [1] 
         * 于是添加如下代码
         */
        if(nums.length==1)
            return;
        int index = 0;
        int nextIndex = (index+k)%nums.length;
        int temp = 0;
        for(int i = 0 ;i<nums.length;i++){
            temp = nums[nextIndex];
            nums[nextIndex]=nums[0];
            nums[0]=temp;
            nextIndex = (nextIndex+k)%nums.length;
        }
        System.out.println("sss");
    }
    
}
