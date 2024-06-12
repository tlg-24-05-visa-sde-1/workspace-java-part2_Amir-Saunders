package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;

public class DuckRaceApp {
    private Board board = Board.getInstance();
    private Scanner scanner = new Scanner(System.in);

    public void execute(){
        welcome();
        showBoard();
        int id = promptId();
        Reward reward = propmtForReward();
        updateBoard(id,reward);
        showBoard();
    }


    private void updateBoard(int id, Reward reward) {
        board.update(id,reward);
    }

    private Reward propmtForReward() {

        Reward reward = null;

        boolean validInput = false;
        while(!validInput){
            System.out.println("Please enter [D]ebit card or [P]rizes");
            String input = scanner.nextLine().trim().toUpperCase();
            if(input.matches("D|P")){
                validInput = true;
                if(input.equals("D")){
                    reward = Reward.DEBIT_CARDS;
                }else{
                    reward = Reward.PRIZES;
                }
            }
        }

        return reward;
    }




    private int promptId() {
       int id = 0;

       boolean validInput = false;
       while(!validInput){
           System.out.println("Please enter id of the winner [1-16]: ");
           String input = scanner.nextLine().trim();
           if(input.matches("\\d{1,2}")){
               id = Integer.parseInt(input);
               if(id >= 1 && id <= 16){
                   validInput = true;
               }
           }

       }
        return id;
    }


    private void showBoard() {
        board.show();
    }


    private void welcome() {
        System.out.println("\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("W E L C O M E    T O   T H E   D U C K    R A C E");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\n");
    }

}
