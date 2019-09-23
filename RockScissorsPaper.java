import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    //this is the program coded for the rock, scissors,paper game,

    public static void main(String[] args){

        System.out.println("Welcome to Rock, Scissors, Paper game!");
        int playerCount=0;
        int computerCount=0;

        while (playerCount<=3 || computerCount<=3) {

            //Player makes the choice,
            Scanner input=new Scanner(System.in);
            System.out.print("Please Type; Rock, Scissors or Paper=");
            String playerChoice=input.nextLine();

            //Computer makes the choice,
            String[] arr={"Rock", "Paper", "Scissors"};
            Random r=new Random();
            int computerChoice=r.nextInt(arr.length);
            System.out.print("Computer Choice is= ");
            System.out.println(arr[computerChoice]);

            //The winner of turn is defined,
            if (playerChoice.equals("Rock") && arr[computerChoice].equals("Scissors") || playerChoice.equals("Scissors") && arr[computerChoice].equals("Paper") || playerChoice.equals("Paper") && arr[computerChoice].equals("Rock")) {
                System.out.println("Player wins");
                playerCount = playerCount+1;
            } else if (playerChoice.equals("Rock") && arr[computerChoice].equals("Rock") || playerChoice.equals("Scissors") && arr[computerChoice].equals("Scissors") || playerChoice.equals("Paper") && arr[computerChoice].equals("Paper")) {
                System.out.println("Draw");
            } else {
                System.out.println("Computer Wins");
                computerCount = computerCount+1;
            }
            System.out.println("Score is; Player= "+playerCount+" vs Computer= "+computerCount);

            //Breaks the loop to end the game when one side reaches 3 wins,
            if (playerCount==3 || computerCount==3){
                break;
            }
        }

        //Winner is announced,
       if (playerCount==3) {
            System.out.println("PLAYER is the winner of the game!");
        } else if (computerCount==3) {
            System.out.println("COMPUTER is the winner of the game!");
        }
    }
}
