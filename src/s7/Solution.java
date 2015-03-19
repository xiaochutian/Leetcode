/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s7;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public int reverse(int x) {
        boolean positive = true;
        if(x<0){
            x=-x;
            positive=false;
        }
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        if(positive==false)
            sb.append("-");
        sb.reverse();
        int result=0;
        //当超过范围时，会抛出异常。这时，返回0；
        try{
            result=Integer.parseInt(sb.toString());
        }catch(Exception e){
        }
        return result;
    }
}
