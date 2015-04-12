/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s66.plusone;

/**
 *
 * @author XiaoChutian-BUPT
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        //先检查是否所有位都为9,
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                count++;
            } else {
                break;
            }
        }

        //如果都为9，则申请一个新的数组，直接返回10000...
        if (count == digits.length) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            //如果，不是都为9，则在原来数组上进行+1操作
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 10) {
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;
                } else {
                    break;
                }
            }
            return digits;
        }

    }
}
