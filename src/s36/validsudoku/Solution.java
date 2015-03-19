/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s36.validsudoku;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xiaochutian
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        /**
         * row表示行的标志数组。
         * 比如，row[0][1]=true表示，第1行的，‘2’已经填过了。
         * 
         * column表示列的标志数组。
         * 同row。比如，column[1][2]=true表示，第2列的，‘3’已经填过了。
         * 
         * box表示第几个子格子。
         * 若i,j代表具体数字，则(i-1)/3*3+(j-1)/3+1表示子格子编号（从1开始）。
         * 若i,j代表数组下标，则i/3*3+j/3表示子格子数组的下标（从0开始）。
         * 
         * 所有标志位的初始为false
         */
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        boolean result = true;
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                switch (board[i][j]) {
                    case '.':
                        break;
                    case '1':
                        if(row[i][0]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][0]=true;
                        }
                        if(column[j][0]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][0]=true;
                        }
                        if(box[i/3*3+j/3][0]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][0]=true;
                        }
                        break;
                    case '2':
                        if(row[i][1]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][1]=true;
                        }
                        if(column[j][1]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][1]=true;
                        }
                        if(box[i/3*3+j/3][1]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][1]=true;
                        }
                        break;
                    case '3':
                        if(row[i][2]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][2]=true;
                        }
                        if(column[j][2]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][2]=true;
                        }
                        if(box[i/3*3+j/3][2]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][2]=true;
                        }
                        break;
                    case '4':
                        if(row[i][3]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][3]=true;
                        }
                        if(column[j][3]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][3]=true;
                        }
                        if(box[i/3*3+j/3][3]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][3]=true;
                        }
                        break;
                    case '5':
                        if(row[i][4]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][4]=true;
                        }
                        if(column[j][4]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][4]=true;
                        }
                        if(box[i/3*3+j/3][4]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][4]=true;
                        }
                        break;
                    case '6':
                        if(row[i][5]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][5]=true;
                        }
                        if(column[j][5]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][5]=true;
                        }
                        if(box[i/3*3+j/3][5]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][5]=true;
                        }
                        break;
                    case '7':
                        if(row[i][6]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][6]=true;
                        }
                        if(column[j][6]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][6]=true;
                        }
                        if(box[i/3*3+j/3][6]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][6]=true;
                        }
                        break;
                    case '8':
                        if(row[i][7]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][7]=true;
                        }
                        if(column[j][7]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][7]=true;
                        }
                        if(box[i/3*3+j/3][7]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][7]=true;
                        }
                        break;
                    case '9':
                        if(row[i][8]==true){
                            result = false;
                            break outer;
                        }else{
                            row[i][8]=true;
                        }
                        if(column[j][8]==true){
                            result = false;
                            break outer;
                        }else{
                            column[j][8]=true;
                        }
                        if(box[i/3*3+j/3][8]==true){
                            result = false;
                            break outer;
                        }else{
                            box[i/3*3+j/3][8]=true;
                        }
                        break;
                }
            }
        }
        return result;
    }
}
