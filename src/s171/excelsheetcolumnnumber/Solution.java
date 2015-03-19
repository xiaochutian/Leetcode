/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s171.excelsheetcolumnnumber;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public int titleToNumber(String s) {
        char[] sa = s.toCharArray();
        int length = sa.length;
        int result = 0;
        for(int i=0;i<length;i++){
            result+= (sa[i]-64)*Math.pow(26, length-i-1);
        }
        return result;
    }
}
