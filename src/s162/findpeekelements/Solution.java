/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s162.findpeekelements;

import java.util.List;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    public int findPeakElement(List<Integer> nums) {
        if(nums.get(0)>nums.get(1))
            return 0;
        if(nums.get(nums.size()-1)>nums.get(nums.size()-2))
            return nums.size()-1;
        
        for(int i=1;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i-1)&&nums.get(i)>nums.get(i+1))
                return i;
        }
        return 0;
    }
}
