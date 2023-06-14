import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Lift liftA = new Lift("A");
        Lift liftB = new Lift("B");

        liftA.position = 0;
        liftB.position = 6;

        liftA.displayPosition();
        liftB.displayPosition();
        System.out.println();
        System.out.println();

        while(true)
        {
            System.out.println("Do you want to start using the elevators? ... Type 1 to use or type 0 to exit the application");
            int ok =scan.nextInt();
            if(ok == 0)
            {
                break;
            }

            boolean lift_A_verification = false;
            boolean lift_B_verification = false;

            System.out.println("What is your position in the building: ");
            int level1 = scan.nextInt();
            if(Math.abs(level1 - liftA.position) <= Math.abs(level1 - liftB.position) && liftA.position < liftB.position)
            {
                liftA.displayElevator();
                lift_A_verification = true;
            }
            else
            {
                liftB.displayElevator();
                lift_B_verification = true;
            }


            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The elevator has arrived. Please choose the floor you would like to go. . . ");
            int level2 = scan.nextInt();

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The elevator has arrived at the selected floor: ");


            if(lift_A_verification == true)
            {
                liftA.position = level2;
                liftA.displayPosition();
                liftB.displayPosition();
            }
            if(lift_B_verification == true)
            {
                liftB.position = level2;
                liftB.displayPosition();
                liftA.displayPosition();
            }
        }

    }
}
