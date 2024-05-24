import java.util.Random;
import java.util.Scanner;

public class GameDice {
    
    //the class varibles creates instances of the random, scanner, user and dice class
    Random rand = new Random();
    Scanner input;
    User user = new User();

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    
    //this method sets the face value and checks if the same of the face values is 7 or not
    public void playGame(){
        System.out.println("Welcome to my dice game");
        System.out.println("for you to win this game ");
        System.out.println("you must genarate a sum of 7 from the two dice");

        while (true) {
            System.out.println();
            System.out.println("''''''''''''''''");
            System.out.println("press 1 to roll");
            System.out.println("press 2 to exit");

            try{

                input = new Scanner(System.in);
                int userInput = input.nextInt();

                if(userInput == 1){
                    //randomly get a number between 1 and 6
                    int d1 = dice1.setFaceValue(rand.nextInt(1,7));
                    int d2 = dice2.setFaceValue(rand.nextInt(1,7));
                    
    
                    int result = d1 + d2;
    
                    if(result == 7){
                        System.out.printf("you win dice1 was %d and dice2 was %d", d1, d2);
                    }
                    else{
                        System.out.printf("you loose dice1 was %d and dice2 was %d", d1, d2);
                    }
                }
                else if(userInput == 2){
                    System.out.println("good bye");
                    break;
                }
                else{
                    System.out.println("invalid input");
                    System.out.println("please enter a number either 1 or 2");
                }
            }catch(Exception e){
                System.out.println("invalid input");
                System.out.println("please enter a either 1 or 2");
            }
        }
    }
}
