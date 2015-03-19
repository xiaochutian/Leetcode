/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s165;

/**
 *
 * @author Xiaochutian
 */
public class Solution {

    public int compareVersion(String version1, String version2) {

        /**
         * 改进，先补齐两个版本。再比较。（思路问题）
         */
        int count1 = 0, count2 = 0;
        for (char c : version1.toCharArray()) {
            if (c == '.') {
                count1++;
            }
        }
        for (char c : version2.toCharArray()) {
            if (c == '.') {
                count2++;
            }
        }

        int sub = count1 - count2;
        if (sub >= 0) {
            StringBuffer sb = new StringBuffer();
            sb.append(version2);
            for (int i = 0; i < sub; i++) {
                sb.append(".0");
            }
            version2 = sb.toString();
        } else {
            sub = Math.abs(sub);
            StringBuffer sb = new StringBuffer();
            sb.append(version1);
            for (int i = 0; i < sub; i++) {
                sb.append(".0");
            }
            version1 = sb.toString();
        }

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int result = 0;
        for (int i = 0; i < v1.length; i++) {
            if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) {
                result = 1;
                break;
            } else if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])) {
                result = -1;
                break;
            }
        }

        /**
         * 改进，先转换成数字，再比较。 仍然无法通过，“1.0”与“1”相同 第二次，没通过。
         */
//        String[] v1 = version1.split("\\.");  
//        String[] v2 = version2.split("\\.");
//        int result;
//        if(v1.length>v2.length){
//            result=1;
//            for(int i=0;i<v2.length;i++){
//                if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])){
//                    result=-1;
//                    break;
//                }
//            }
//        }else if(v1.length<v2.length){
//            result=-1;
//            for(int i=0;i<v1.length;i++){
//                if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])){
//                    result=1;
//                    break;
//                }
//            }
//        }else{
//            result=0;
//            for(int i=0;i<v1.length;i++){
//                if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])){
//                    result=1;
//                    break;
//                }else if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])){
//                    result=-1;
//                    break;
//                }
//            }
//        }
        //比较不能使用stringA.compareTo(stringB)，这样“01”与“1”通不过测试。必须得先转换成数字。
        //第一次，没通过。
        /*if(v1.length>v2.length){
         String[] v1 = version1.split("\\.");  
         String[] v2 = version2.split("\\.");
         int result;
         result=1;
         for(int i=0;i<v2.length;i++){
         if(v1[i].compareTo(v2[i])<0){
         result=-1;
         break;
         }
         }
         }else if(v1.length<v2.length){
         result=-1;
         for(int i=0;i<v1.length;i++){
         if(v1[i].compareTo(v2[i])>0){
         result=1;
         break;
         }
         }
         }else{
         result=0;
         for(int i=0;i<v1.length;i++){
         if(v1[i].compareTo(v2[i])>0){
         result=1;
         break;
         }else if(v1[i].compareTo(v2[i])<0){
         result=-1;
         break;
         }
         }
         }*/
        return result;
    }
}
