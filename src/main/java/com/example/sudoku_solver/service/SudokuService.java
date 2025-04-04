package com.example.sudoku_solver.service;

public class SudokuService {
    public void solveSudoku(int[][] board) {
        rec(board, 0, 0);
    }

    private boolean rec(int[][] board, int n, int m){
        if(n == 9){
            return true;
        }

        if(m == 9){
            return rec(board,n+1,0);
        }

        if(board[n][m] != 0){
            return rec(board, n, m+1);
        }

        for(char i=1;i <= 9;i++){
            if(check(board, n, m, i)){
                board[n][m] = i;

                if(rec(board, n, m+1)){
                    return true;
                }

                board[n][m] = 0;

            }
        }
        return false;
    }


    private boolean check(int[][] board, int n, int m, int num){
        for(int i=0;i < 9;i++){
            if(board[i][m] == num){
                return false;
            }

            if(board[n][i] == num){
                return false;
            }

            int row = 3 * (n/3) + i / 3;
            int col = 3 * (m/3) + i % 3;

            if(board[row][col] == num){
                return false;
            }

        }
        return true;
    }

}
