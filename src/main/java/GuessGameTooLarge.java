import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class GuessGameTooLarge {

    public static void main(String[] args){
        guessGame();
    }

    static void guessGame(){

        int guess=1+(int)(100*Math.random());
        Scanner scan=new Scanner(System.in);


    //trial
             int trials=5;

         for(int i=0; i<trials;i++){
             System.out.println("Enter number within 1 to 100 range and 5 times trial");
             int userGuess=scan.nextInt();
             if(guess==userGuess){
                 System.out.println("Guess is correct "+ guess + "userGuess:"+userGuess);
                 break;
             }
             else if(guess>userGuess && i!=trials-1){
                 System.out.println("Guess number is too small");
             }
              else if(guess<userGuess && i!=trials-1){
                 System.out.println("guess number is too large");
             }
              if(i==trials-1){
                System.out.println("All your try are over!!");
            }
        }
    }


}
