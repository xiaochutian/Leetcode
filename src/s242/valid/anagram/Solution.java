/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s242.valid.anagram;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        //首先判断长度是否一样，不一样，直接返回false
        if(s.length()!=t.length()){
            return false;
        }
        boolean result = true;
        Map<Integer,Integer> mapS = new HashMap<>();
        for(char c : s.toCharArray()){
            Integer integerC = (int)c;
            if(mapS.containsKey(integerC)){
                mapS.put(integerC, mapS.get(integerC)+1);
            }else{
                mapS.put(integerC, 1);
            }
        }
        for(char c : t.toCharArray()){
            Integer integerC = (int)c;
            if(mapS.containsKey(integerC)&&mapS.get(integerC)-1>=0){
                mapS.put(integerC, mapS.get(integerC)-1);
            }else{
                result = false;
                break;
            }
        }
        return result;
    }
}