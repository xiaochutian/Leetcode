/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s190.reversebits;

/**
 *Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer
 * 
 * 
 * @author Xiaochutian
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //方法二，bit操作。
        int a = 1;
        int result = 0;
        for(int i=0;i<32;i--){
            result<<=1;
            if((a&n)!=0)
                result+= 1;
            a<<=1;
        }
        return result;
        
        
        
        //先得到二进制串，但是，不足32位。需要在后面用0补齐
//        String s = Integer.toBinaryString(n);
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<32-s.length();i++)
//            sb.append(0);
//        sb.append(s);
////        System.out.println(sb.toString());
//        sb.reverse();
////        System.out.println(sb.toString());
//        
//        /**
//         * 这样，是转换成有符号整数，所以用例：1无法通过
//         * Runtime Error Message:	Line 13: java.lang.NumberFormatException: For input string: "10000000000000000000000000000000"
//         * Last executed input:	           1 (00000000000000000000000000000001)
//         */
////        return Integer.parseInt(sb.toString(), 2);
//        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
