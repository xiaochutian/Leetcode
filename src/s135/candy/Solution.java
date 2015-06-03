/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s135.candy;

/**
 *
 * @author Xiaochutian
 */
public class Solution {
    /**
     * 0、创建与ratings[]相同大小的糖果分配数组candys[]，并都初始化为0。
     * 1、首先需要把，rating相同且相邻的孩子合并。
     * 因为，相同的孩子必须有同样的糖果数。直接合并成一个进行处理。
     * （如果不合并会出现问题，比如，ratings[]={3,3,3,2}）
     * 做法：先把第一个rating的下标加入下标数组，
     * 其他的rating与前面一个比较，
     * 如果不相同，则把下标加入下标数组。如果相同，则不加入。
     * 2、创建一个与下标数组大小相同的数组，用来存放糖果数组。
     * 3、对下标数组，按照rating从小到大的顺序排序，找到糖果数组的赋值顺序。
     * @param ratings
     * @return 
     */
    public int candy(int[] ratings) {
        //总人数
        int childrenCount = ratings.length;
        //小孩的下标数组，用来找出，rating从小到大的index排序。
        //即在不改变原来小孩站位的条件下，找到rating从小到大的访问顺序
        int[] index = new int[childrenCount];
        //小孩的糖果数量
        int[] candys = new int[childrenCount];
        
        //为下标数组赋值，从0到childrenCount-1
        for(int i=0;i<childrenCount;i++){
            index[i]=i;
        }
        
        //为下标排序，找出rating从小到大的访问顺序
        //巧妙的排序，比较第一个数组，排第二个数组。
        for(int i=0;i<childrenCount;i++){
            for(int j=i+1;j<childrenCount;j++){
                //注意，这里使用的是ratings[index[i]]，是排序的关键
                //交换下标后，使用的仍然是index数组作为下标，所以可以排序成功。
                if(ratings[index[i]]>ratings[index[j]]){
                    int temp = index[j];
                    index[j] = index[i];
                    index[i] = temp;
                }
            }
        }
        
        for(int i=0;i<childrenCount;i++){
            //左右邻居的糖果数量
            int leftNeighborsCandy = 0;
            int rightNeighborsCandy = 0;
            //当前小孩的糖果数，初始化为1（至少一个）
            int thisChildsCandy = 1;
            
            /**
             * 必须先从右邻居开始查看。
             * 因为，当rating相同的时候，默认先给左边的孩子糖，
             * 
             */
            
            //如果有左邻居
            if(index[i]-1>=0){
                //先获得左邻居的糖果数
                leftNeighborsCandy = candys[index[i]-1];
                if(ratings[index[i]]>ratings[index[i-1]]){
                    thisChildsCandy = leftNeighborsCandy+1;
                }
                    
            }
            if(index[i]+1<=childrenCount-1){
                rightNeighborsCandy = candys[index[i]+1];
            }
        }
        
        return 0;
    }
//    public int candy(int[] ratings) {
//        //总人数
//        int childrenCount = ratings.length;
//        //小孩的下标数组，用来找出，rating从小到大的index排序。
//        //即在不改变原来小孩站位的条件下，找到rating从小到大的访问顺序
//        int[] index = new int[childrenCount];
//        //小孩的糖果数量
//        int[] candys = new int[childrenCount];
//        
//        //为下标数组赋值，从0到childrenCount-1
//        for(int i=0;i<childrenCount;i++){
//            index[i]=i;
//        }
//        
//        //为下标排序，找出rating从小到大的访问顺序
//        //巧妙的排序，比较第一个数组，排第二个数组。
//        for(int i=0;i<childrenCount;i++){
//            for(int j=i+1;j<childrenCount;j++){
//                //注意，这里使用的是ratings[index[i]]，是排序的关键
//                //交换下标后，使用的仍然是index数组作为下标，所以可以排序成功。
//                if(ratings[index[i]]>ratings[index[j]]){
//                    int temp = index[j];
//                    index[j] = index[i];
//                    index[i] = temp;
//                }
//            }
//        }
//        
//        for(int i=0;i<childrenCount;i++){
//            //左右邻居的糖果数量
//            int leftNeighborsCandy = 0;
//            int rightNeighborsCandy = 0;
//            //当前小孩的糖果数，初始化为1（至少一个）
//            int thisChildsCandy = 1;
//            
//            /**
//             * 必须先从右邻居开始查看。
//             * 因为，当rating相同的时候，默认先给左边的孩子糖，
//             * 
//             */
//            
//            //如果有左邻居
//            if(index[i]-1>=0){
//                //先获得左邻居的糖果数
//                leftNeighborsCandy = candys[index[i]-1];
//                if(ratings[index[i]]>ratings[index[i-1]]){
//                    thisChildsCandy = leftNeighborsCandy+1;
//                }
//                    
//            }
//            if(index[i]+1<=childrenCount-1){
//                rightNeighborsCandy = candys[index[i]+1];
//            }
//        }
//        
//        return 0;
//    }
}