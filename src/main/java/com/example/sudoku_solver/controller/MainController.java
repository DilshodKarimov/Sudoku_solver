package com.example.sudoku_solver.controller;

import com.example.sudoku_solver.model.Matrix;
import com.example.sudoku_solver.service.SudokuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MainController {

    public int[][] board;

    SudokuService sudokuService = new SudokuService();


    @GetMapping("/")
    public String main(){
        return "main.html";
    }
    @GetMapping("/main.html")
    public String main1(){
        return "main.html";
    }



    @PostMapping("/main.html")
    public String post_main(Matrix matrix, Model model){
        this.board = matrix.board;
        sudokuService.solveSudoku(board);
        return "redirect:/result.html";
    }

    @GetMapping("/result.html")
    public String result(Matrix matrix, Model model){
        model.addAttribute("board",board);
        return "result.html";
    }



}
