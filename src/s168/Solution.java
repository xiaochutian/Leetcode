/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s168;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(true){
            int a = n/26;
            int b = n-a*26;
            if(b==0){
                b=26;
                a--;
            }
            sb.append((char)(b+64));
            if(a==0)
                break;
            else
                n=a;
        }
        sb.reverse();
        return sb.toString();
    }
}
