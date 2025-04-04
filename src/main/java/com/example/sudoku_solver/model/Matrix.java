package com.example.sudoku_solver.model;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class Matrix {

    public int[][] board;


    public Matrix(){
        board = new int[9][9];
        for(int i=0;i < 9;i++){
            for (int j=0;j < 9;j++){
                board[i][j] = 0;
            }
        }
    }





    public void show(){
        System.out.println(board);
    }
}
