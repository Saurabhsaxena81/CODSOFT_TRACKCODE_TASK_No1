import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        /*
         create the class Game ,which allows a user to play guess the number once game should have the following methods :
         1. Constructor to generate the number 
         2.takeUserInput() to take a user input of number 
         3. isCorrectNumber() to detect wh\ether the number enbterd by the user is true 
         4. getters and setters for the number of guesses 
         Use properties suc as noOfGuess(int) etc to get the task done 

         */
       
        boolean b=false;
        //Repeat until user guessthe correct number
        Game g=new Game(); 
        while(!b){
            
        //  Game g=new Game();
        g.takeUserInput();
         b= g.isCorrectNumber();    
    }
    System.out.println("Congratulation! you guess the correct number. ");
    }
}
class Game {
    public int number ;
    public int inputnumber;
    public int noOfGuess;
    public int getnoOfGuess(){
        return noOfGuess;
    }
    public void setnoOfGuess(int noOfGuess){
        this.noOfGuess=noOfGuess;
    }
     Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);

    }
    int  takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number ");
        inputnumber= sc.nextInt();
        return inputnumber;
        
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        if (inputnumber==number){
            System.out.printf("You guess the correct  number %d in %d guesses\n",number,noOfGuess);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("Too Less...");
        }
        else if(inputnumber>number){
            System.out.println("Too High...");
        }
        //random number generated 
        // System.out.println("number is "+number);
       
        return false;

    }
}
