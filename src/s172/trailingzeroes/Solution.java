/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s172.trailingzeroes;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Note: Your solution should be in logarithmic time complexity.
 *
 * @author Xiaochutian
 */
public class Solution {

    public int trailingZeroes(int n) {
        //第十版
        int count =0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;

        //第九版
//        int count = 0;
//        int x = 5;
//        while(n>=x){
//            count+= n/x;
//            x*=5;
//        }
//        return count;

        //第八版，自需要找5的个数
//        int count = 0;
//        for(int i =1;i<=n;i++){
//            int temp = i;
//            while(temp%5==0){
//                count++;
//                temp/=5;
//            }
//        }
//        return count;
        //第七版
//        if(n<5)
//            return 0;
//        long m = 1;
//        for(int i=2;i<=n;i++){
//            m*=i;
//        }
//        int count=0;
//        while(m%10==0){
//            count++;
//            m/=10;
//        }
//        while(m%5==0){
//            count++;
//            m/=5;
//        }
//        return count;

        //第六版仍然超过
//        int countTen = 0;
//        int countFive = 0;
////        int countTwo = 0;
//
//        if (n < 5) {
//            return 0;
//        }
//        for (int i = 2; i <= n; i++) {
//            int temp = i;
//            while (temp % 10 == 0) {
//                countTen++;
//                temp /= 10;
//            }
//            while (temp % 5 == 0) {
//                countFive++;
//                temp /= 5;
//            }
//            //不用除以2，因为，有多少个5，就一定有比5多的2.
//            //任意数m*5<n，都有m*2<n。所以，2的个数>=5的个数
////            while (temp % 2 == 0) {
////                countTwo++;
////                temp /= 2;
////            }
//        }
//
//        return countFive+countTen;

        //第五版仍然超时 Last executed input:	1808548329

        /*考虑到怎么会出现末尾的0，由2*5得来，或者直接在乘数里面有10的子因子。
         //解决办法，分别计算n!里面的每个因子，
         //里面有多少个10的因子，多少个5的因子，多少个2的因子。
         //（按顺序来，10在5和2的前面。5和2的顺序没关系，因为，除了10的因子之后，5和2不可能同时存在）
         */
//        int countTen = 0;
//        int countFive = 0;
//        int countTwo = 0;
//        
//        if(n<5)
//            return 0;
//        for(int i=2;i<=n;i++){
//            int temp  = i;
//            while(temp%10==0){
//                countTen++;
//                temp/=10;
//            }
//            while(temp%5==0){
//                countFive++;
//                temp/=5;
//            }
//            while(temp%2==0){
//                countTwo++;
//                temp/=2;
//            }
//        }
//        
//        return countFive<=countTwo?countFive+countTen:countTwo+countTen;
        //第四版，仍然超过时间限制。需要人脑做更多的事情。进一步找规律
//        if(n<5)
//            return 0;
//        long m = 1;
//        for(int i=2;i<=n;i++)
//            m*=i;
//        String s = Long.toString(m);
//        int result =0;
//        for(int i=s.length()-1;i>=0;i--)
//            if(s.charAt(i)=='0')
//                result++;
//        return result;
        //第三版，超过时间限制。 Last executed input:	1808548329
//        if(n<5)
//            return 0;
//        long m = 1;
//        for(int i=2;i<=n;i++){
//            m*=i;
//        }
//        int result = 0;
//        do {
//            if (m % 10 == 0) {
//                result++;
//            }
//            m /= 10;
//        } while (m != 0);
//        return result;
        //第二版，是n的阶乘。没有看到n!
//        if(n==0)
//            return 0;
//        int result = 0;
//        do {
//            if (n % 10 == 0) {
//                result++;
//            }
//            n /= 10;
//        } while (n != 0);
//        return result;
        //第一版测试用例0无法通过。需要尾随的0。输入0，应该输出0，不应该输出1
//        int result = 0;
//        do{
//            if(n%10==0)
//                result++;
//            n/=10;
//        }while(n!=0);
//        return result;
    }
}
