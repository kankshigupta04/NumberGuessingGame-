package numberGuessing;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void GuessingGame() {
        Scanner sc = new Scanner(System.in);
        int trial = 6;
        int i, guess, j = 1;
        int totalScore=0;

        while (j < 4) {
            int number = 1 + (int) (100 * Math.random());
            //System.out.println("number = " + number);
            for (i = 1; i < trial; i++) {
                System.out.println();
                System.out.println("Enter your guess: ");
                guess = sc.nextInt();
                if (guess == number) {
                    System.out.println("YOU GOT IT RIGHT! CONGRATULATIONS!!");
                    break;
                } else if (guess < number && i != trial - 1) {
                    System.out.println("the number " + guess + " is SMALLER than the generated number");
                } else if (guess > number && i != trial - 1) {
                    System.out.println("the number " + guess + " is GREATER than the generated number");
                }

            }
            switch(i){
                case 1:
                    System.out.println("your score for round "+j+" is 5");
                    totalScore+=5;
                    break;
                case 2:
                    System.out.println("your score for round "+j+"  is 4");
                    totalScore+=4;
                    break;
                case 3:
                    System.out.println("your score for round "+j+" is 3");
                    totalScore+=3;
                    break;
                case 4:
                    System.out.println("your score for round "+j+"  is 2");
                    totalScore+=2;
                    break;
                case 5:
                    System.out.println("your score for round "+j+"  is 1");
                    totalScore+=1;
                    break;
                default:
                    totalScore+=0;
            }
            if (i == trial) {
                System.out.println("You have exhausted all your chances..Better luck next time!");
                System.out.println("your score for round "+j+"  is 0");
            }
            j += 1;

        }
        System.out.println();
        System.out.println("YAY!! Your total score is :"+totalScore);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println();
        System.out.println("Try and guess the number randomly generated between 1 and 100");
        System.out.println("The game consists of three rounds");
        System.out.println("You will get 5 tries for guessing in one round");
        NumberGuessingGame();
    }
}
