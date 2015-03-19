/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s191.numberof1bits;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    // you need to treat n as an unsigned value
   //方法1，用JAVA接口
//    public int hammingWeight(int n) {
//        int count=0;
//        for(char c: Integer.toBinaryString(n).toCharArray())
//            if(c=='1')
//                count++;
//        return count;
//    }
    //方法2，位运算
    public int hammingWeight(int n) {
        int count=0;
        int check = 1;
        for(int i=0;i<32;i++,check<<=1)
            if((n&check)!=0)
                count++;
        return count;
    }
}