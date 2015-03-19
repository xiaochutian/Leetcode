/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s83;

/**
 *
 * @author Xiaochutian
 */
public class Solution {

    public int removeDuplicates(int[] A) {
        /**
         * 第三版，在第一版的基础上改。先赋值给B，然后再赋值回给A。
         */
        if (A.length == 0) {
            return 0;
        }
        int[] B = new int[A.length];
        int temp = A[0];
        int index = 0;
        B[index++] = temp;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == temp) {
                continue;
            } else {
                temp = A[i];
                B[index++] = temp;
            }
        }
        for(int i =0;i<A.length;i++)
            A[i]=B[i];
        
        return index;

        /**
         * 第二版，想着不用返回B，所以只返回index。 但是，没有通过，因为A没有改变。 Input: [1,1,2] Output: [1,1]
         * Expected: [1,2]
         */
//        if(A.length==0)
//            return 0;
////        int[] B = new int[A.length];
//        int temp = A[0];
//        int index=0;
//        index++;
////        B[index++]=temp;
//        for(int i=1;i<A.length;i++){
//            if(A[i]==temp)
//                continue;
//            else{
//                temp = A[i];
//                index++;
////                B[index++]=temp;
//            }
//        }
//        return index; 
        /**
         * 第一版，想着返回B，但是又不用返回。
         */
//        if(A.length==0)
//            return 0;
//        int[] B = new int[A.length];
//        int temp = A[0];
//        int index=0;
//        B[index++]=temp;
//        for(int i=1;i<A.length;i++){
//            if(A[i]==temp)
//                continue;
//            else{
//                temp = A[i];
//                B[index++]=temp;
//            }
//        }
//        return index; 
    }
}
