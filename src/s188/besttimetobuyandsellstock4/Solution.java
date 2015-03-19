/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s188.besttimetobuyandsellstock4;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Xiaochutian
 * 
 * 在最多k次交易中，最多能赚多少
 */
public class Solution {
    public int maxProfit(int k, int[] prices) {
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                int temp = prices[j]-prices[i];
                if(temp>max){
                    max = temp;
                    start = i;
                    end = j;
                }
            }
        }
        
    }
    public int getMax(int start,int end,int[] prices){
        
    }
//    public int maxProfit(int k, int[] prices) {
//        if(prices.length<2)
//            return 0;
//        int[] earn = new int[prices.length];
//        int earnIndex = 0;
//        int earnTemp  = 0;
//        for(int i=0;i<prices.length-1;i++){
//            int temp =  prices[i+1]-prices[i];
//            if(temp>=0){
//                earnTemp += temp;
//            }
//            else{
//                earn[earnIndex] = earnTemp;
//                earnTemp = 0;
//                earnIndex++;
//            }
//        }
//        earn[earnIndex] = earnTemp;
//        Arrays.sort(earn);
//        int result = 0;
//        for(int i=earn.length-1;i>earn.length-1-k;i--){
//            if(earn[i]>0)
//                result+=earn[i];
//            else
//                break;
//        }
//        return result;
//    }
}
