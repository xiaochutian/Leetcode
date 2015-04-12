/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s187.repeateddnasequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public final int sequenceLength = 10;
    
    
    /*
    第一版，超出内存限制 
    Memory Limit Exceeded
    
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> moreThanOnece  = new HashSet<>();
        HashSet<String> exist = new HashSet<>();
        if(s.length()<=sequenceLength)
            return new ArrayList<>();
        for(int i =0;i<s.length()+1-sequenceLength;i++){
            String sub = s.substring(i, i+sequenceLength);
            if(exist.contains(sub))
                moreThanOnece.add(sub);
            else
                exist.add(sub);
        }
        return new ArrayList<>(moreThanOnece);
    }
    */
}