/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s125.validpalindrome;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9'))
                sb.append(c);
        }
        String a = sb.toString().toLowerCase();
        String b = sb.reverse().toString().toLowerCase();
        return a.equals(b);
    }
}
