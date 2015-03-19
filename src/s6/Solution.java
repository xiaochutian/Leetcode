/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s6;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public String convert(String s, int nRows) {
        char[] sArray = s.toCharArray();
        int length = sArray.length;
        
        //最后一个测试用例没通过，Last executed input: "A", 1 
        //添加如下代码
        if(nRows==1)
            return s;
        
        StringBuffer sb = new StringBuffer();
        //第一行
        for(int i=0;i<length;i+=(nRows-1)*2)
            sb.append(sArray[i]);
        //第二行到倒数第二行，走Z字形，至少有三行
        for(int i=1;i<nRows-1;i++){
            for (int j = i;; j += (nRows - 1) * 2) {
                if(j<length)
                    sb.append(sArray[j]);
                else
                    break;
                if(j + (nRows - 1 - i)*2<length)
                    sb.append(sArray[j + (nRows - 1 - i)*2]);
                else
                    break;
            }
        }
        //最后一行
        for(int i=nRows-1;i<length;i+=(nRows-1)*2)
            sb.append(sArray[i]);
        
        return sb.toString();
    }
}
