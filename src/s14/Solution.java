/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s14;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        if(count==0)
            return "";
        if(count==1)
            return strs[0];
        
        int minLength = strs[0].length();
        for(String s : strs)
            if(s.length()<minLength)
                minLength = s.length();
        
        if(minLength==0)
            return "";
        
        StringBuffer sb = new StringBuffer();
        /**
         * 加上“失配”标志位。如果是，所有都匹配，然后正常跳出。就不需要删掉最后一个字符。
         * 如果，是因为失配而跳出的，就需要删掉最后一个字符。
        */
        boolean shipei = false;
        outer:
        for (int i = 0; i < minLength; i++) {
            sb.append(strs[0].charAt(i));
            for(int j=1;j<count;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    shipei = true;
                    break outer;
                }
            }
        }
        if(shipei==true)
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
            
    }
}
