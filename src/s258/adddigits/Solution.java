/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s258.adddigits;

/**
 * 非负整数，包括0和正整数
 * @author Xiaochutian
 */
public class Solution {
    public int addDigits(int num) {
        //特殊值处理
        if(num==0){
            return 0;
        }
        int remainder = num%9;
        return remainder==0?9:remainder;
    }
}
