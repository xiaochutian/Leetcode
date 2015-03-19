/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s38.countandsay;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public String countAndSay(int n) {
        //第一个序列为"1"。所以需要n--；
        n--;
        String cas = "1";
        for(int i=0;i<n;i++){
            cas = countAndSayOnce(cas);
        }
        return cas;
    }
    public String countAndSayOnce(String s){
        char[] cArray = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int length = cArray.length;
        int count = 1;
        char temp = cArray[0];
        for(int i=1;i<length;i++){
            if(temp == cArray[i])
                count++;
            else{
                sb.append(String.valueOf(count)+String.valueOf(temp));
                temp = cArray[i];
                count =1;
            }
        }
        sb.append(String.valueOf(count)+String.valueOf(temp));
        return sb.toString();
    }
}
