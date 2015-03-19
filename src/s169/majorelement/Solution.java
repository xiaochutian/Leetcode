/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s169.majorelement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public int majorityElement(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i : num){
            if(list.contains(i)){
                int index = list.indexOf(i);
                count.set(index, count.get(index)+1);
            }else{
                list.add(i);
                count.add(1);
            }
        }
        int result = 0;
        for(int i=0;i<count.size();i++){
            if(count.get(i)>=(num.length+1)/2){
                result = list.get(i);
                break;
            }
        }
        return result;
    }
}
