import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        int choice = ran.nextInt(1,10);
        int guess;
        do {
            System.out.println("Enter a number from 1 -10");
            guess = scn.nextInt();
        } while (guess < 1 || guess > 10);
        if(choice==guess){
            System.out.printf("Computer chose %d and you chose %d too!! :)",choice,guess);
        }
        else{
            System.out.printf("Computer chose %d but you chose %d :(",choice,guess);
        }
    }
}
