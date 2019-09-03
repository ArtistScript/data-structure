package com.lc;

/**
 * ClassName: Solution79 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:42<br/>
 *
 */
public class Solution79 {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    boolean result=false;

    public boolean exist(char[][] board, String word) {
        boolean[][] used=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    used[i][j]=true;
                    helper(word.substring(1,word.length()),i,j,board,used);
                    if(result) return true;
                    used[i][j]=false;
                }
            }
        }
        return false;
    }
    private boolean helper(String word,int i ,int j,char[][] board,boolean[][] used){
        if(word.length()==0) result=true;
        else{
            for(int d=0;d<4;d++){
                int newi=i+dx[d];
                int newj=j+dy[d];
                if(judger(newi,newj,used)&&board[newi][newj]==word.charAt(0)){
                    used[i][j]=true;
                    helper(word.substring(1,word.length()),newi,newj,board,used);
                    used[i][j]=false;
                }
            }
        }
        return false;
    }

    private boolean judger(int i,int j,boolean[][] used){
        if(i>=0&&i<used.length&&j>=0&&j<used[0].length&&!used[i][j]) return true;
        else return false;
    }
}
