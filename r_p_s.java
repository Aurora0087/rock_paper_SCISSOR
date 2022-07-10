package com.r_p_s;

import java.util.Scanner;

public class r_p_s {
    static String rps(int a) {
        //using for displaying moves
        String s = "";
        if (a == 1) {
            s = " ROCK ";
        } else if (a == 2) {
            s = " PAPER ";
        } else if (a == 3) {
            s = " SCISSOR ";
        }
        return s;
    }

    public static void main(String[] args) {
        int mx = 3, mi = 1, com_point = 0, pl_point = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("\tLets play ROCK-PAPER-SCISSOR\nWe will gonna play 5 round in every game.");
        while (i < 5) {
            int compute = (int) (Math.random() * (mx - mi + 1) + mi);//generating number between 1 and 3, you can change range to changing mx and mi's value
            System.out.println("\n\t\t\tRound - "+(i+1));//displaying round number
            System.out.println("Please enter your move, Instruction are given below.\nROCK = 1\nPAPER = 2\nSCISSOR = 3\n");//instruction of game
            System.out.print("Your move = ");
            int player = s.nextInt();//taking users move
            if (player < 1 || player > 3) {
                System.out.println("Please enter the correct move.");//if user enters wrong input,u can avoid this
            } else if (player == compute) {
                System.out.println("Its a tie.");
            } else {
                if ((compute == 1 && player == 2) || (compute == 2 && player == 3) || (compute == 3 && player == 1)) {
                    System.out.println("\nComputer's move = " + rps(compute) + "\nYour move = " + rps(player));//displaying computer and users move
                    System.out.println("\nYou won this round.");
                    pl_point++;//if user won
                } else {
                    System.out.println("Computer's move = " + rps(compute) + "\nYour move = " + rps(player));
                    System.out.println("\nYou lose this round.");
                    com_point++;
                }
                System.out.println("\n\t\tafter "+(i+1)+" round SCORE BORD\n\tCOMPUTER = "+com_point+"\tYOU = "+pl_point);//score after every round
                i++;// a round is completed only if anyone won the round
            }
        }
        //end result
        if (com_point<pl_point) System.out.println("You won this game.");
        else {
            System.out.println("Computer won this game.");
        }
    }
}