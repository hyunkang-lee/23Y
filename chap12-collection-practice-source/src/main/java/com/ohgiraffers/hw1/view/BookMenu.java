package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }
    public void mainMenu() {

    }
    public BookDTO inputBook(){

        return new BookDTO();
    }
    public int inputBookNo(){

        return inputBookNo();
    }
    public String inputBookTitle (){

        return inputBookTitle();
    }
    public List<BookDTO> selectSortedBook(){
        int ISBN = 0;
        return bm.sortedBookList(ISBN);
    }
}
