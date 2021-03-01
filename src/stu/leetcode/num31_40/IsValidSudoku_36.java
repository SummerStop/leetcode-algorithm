package stu.leetcode.num31_40;

/**
 * @Author: ls
 * @Date: 2021/1/28 22:56
 */
public class IsValidSudoku_36 {
  public boolean isValidSudoku(char[][] board) {
    boolean[][] row = new boolean[9][9];
    boolean[][] col = new boolean[9][9];
    boolean[][] block = new boolean[9][9];

    for(int i = 0;i < board.length;i ++){
      for(int j = 0;j < board[0].length;j ++){
        if(board[i][j] != '.'){
          int num = board[i][j] - '1';
          int blockIndex = i / 3 * 3 + j / 3;
          if(row[i][num] || col[j][num] || block[blockIndex][num]){
            return false;
          }
          else{
            row[i][num] = true;
            col[j][num] = true;
            block[blockIndex][num] = true;
          }
        }
      }
    }
    return true;
  }
}
