import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Отгадайте число от 1 до 100");
            System.out.println();
            int guess = console.nextInt();
            if (secret > guess) {
                System.out.println("You need to print more!");
            } else if (secret < guess) {
                System.out.println("You need to print less!");
            } else {
                System.out.println("My congratulations! You won!");
            }
        }
    }
}