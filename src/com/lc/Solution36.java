package com.lc;

/**
 * ClassName: Solution36 <br/>
 * Function:  <br/>
 * Date: 2019-08-09 15:34<br/>
 *
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 把位置信息也编码到字符串中，这样就可以利用set来加速对每行每列每个区块是否有重复字符的判断
 * 或者把一行的数字组合，映射到一个区块上去
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}
