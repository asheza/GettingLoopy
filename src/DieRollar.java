import java.util.Scanner;

public class DieRollar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int dieRoll = die1 + die2 + die3;
        int rollNum = 0;

        System.out.println("Roll:       Die1 Die2 Die 3 Sum");
        System.out.println("-------------------------");

        do
        {
                do
                {
                rollNum++;
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                die3 = (int) (Math.random() * 6) + 1;
                dieRoll = die1 + die2 + die3;

                System.out.printf("Roll: %-5d %4d %4d %4d %4d\n", rollNum, die1, die2, die3, dieRoll);
                } while (die1 != die2 || die1 != die3);
        System.out.println("-------------------------");

        System.out.println("All dice are the same after " + rollNum + " throws.");


        System.out.print("Do you want to roll again? (yes/no): ");
        userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}