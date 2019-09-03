package com.lc;

/**
 * ClassName: Solution79 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:42<br/>
 *
 */
public class Solution79 {

    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(exist(board,i,j,word.toCharArray(),0)) return true;
            }
        }
        return false;
    }
    private boolean exist(char[][] board,int i, int j,char[] word,int index){
        if(index==word.length) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]!=word[index]) return false;
        board[i][j]^=(1<<8);
        boolean exits=exist(board,i+1,j,word,index+1)||
                exist(board,i-1,j,word,index+1)||
                exist(board,i,j-1,word,index+1)||
                exist(board,i,j+1,word,index+1);
        board[i][j]^=256;
        return exits;
    }
}
