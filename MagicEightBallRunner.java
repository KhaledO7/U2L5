import java.util.Scanner;

public class MagicEightBallRunner {
    public static void main(String[] args) {

        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your yes-no question and I will answer it: ");
        String question = scan.nextLine();

        int num =  (int) (Math.random() * 7 + 1);
        //System.out.println(num);

        // Get a random number from 1 to 6

        // Use selection statements (if, if-else, else-if)
        // to choose from 1 of 6 responses to yes-no questions, then print it out!
        if ( num == 1 ){
            System.out.println("you are cooked");
        }
         else if ( num == 2 ) {
            System.out.println("you will be prosperous");
        }
        else if ( num == 3 ) {
            System.out.println("you are going to find your true love ");
        }
        else if ( num == 4 ) {
            System.out.println("you are marked with death");
        }
         else if ( num == 5 ) {
            System.out.println("you are for sure an anime weeb, you may not ask anymore questions");
        }
        else if ( num == 6) {
            System.out.println("with 100% doubt");
        }

        }
    }
