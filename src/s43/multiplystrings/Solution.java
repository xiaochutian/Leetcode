/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s43.multiplystrings;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        return null;
        
    }
    private String mulTen(String num){
        return num+"0";
    }
    private String sum(String num1,String num2){
        //假设两个数的长度都不为0
        String longN = null;
        String shortN = null;
        StringBuilder sb = new StringBuilder();
        //两个数，同一个位置上的数，再加上进位的数，的总和
        int oneBitSum = 0;
        //进位的数
        int jinWei = 0;
        
        if(num1.length()<num2.length()){
            longN = num2;
            shortN = num1;
        }else{
            longN = num1;
            shortN = num2;
        }
        
        for(int i = shortN.length()-1;i>=0;i--){
            oneBitSum = longN.charAt(i)-48+shortN.charAt(i)-48+jinWei;
            jinWei = oneBitSum/10;
            sb.append(oneBitSum%10);
            oneBitSum = 0;
        }
        
        //看两个数长度是否一样
        if(longN.length()==shortN.length()){
            //如果一样，同时，进位不为0，则添加进位
            if(jinWei!=0){
                sb.append(jinWei);
            }
        }else{
            //长度不一样，把“进位的数”和“较长的加数”的剩余部分相加
            for(int i =longN.length()-shortN.length()-1;i>=0;i--){
                oneBitSum = longN.charAt(i)-48+jinWei;
                jinWei = oneBitSum/10;
                sb.append(oneBitSum%10);
                oneBitSum = 0;
            }
            //如果，最后以为也进位了，那么把进位添上
            if(jinWei!=0){
                sb.append(jinWei);
            }
        }
        //最后把sb反转，并返回结果
        return sb.toString();
        
    }
}
