package Chapter5Section2;

import java.util.Scanner;

public class OdometerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Odometer odometer = new Odometer();
        boolean reRun = true;
        String choice1;
        String choice2;


        while(reRun) {
            boolean moreTrips = true;
            boolean reset = true;
            System.out.print("The mpg of your car: ");
            double mpg = input.nextDouble();
            odometer.setmpg(mpg);

            while(moreTrips) {
                System.out.print("Miles driven: ");
                odometer.milesOdometer(input.nextDouble());
                System.out.println("Do you have more trips to enter? (y/n)");
                choice1 = input.next();

                if(choice1.equals("y")) {
                    moreTrips = true;
                } else {
                    moreTrips = false;
                }
            }

            System.out.println("The number of gallons used is: " + odometer.getGallonsUsed());

            while (reset) {
                System.out.println("Would you like to reset your odometer? (y/n)");
                choice2 = input.next();

                if(choice2.equals("y")) {
                    System.out.println("Odometer will now be reset!");
                    odometer.resetOdometer();
                    reset = false;
                } else if(choice2.equals("n")){
                    System.out.println("Goodbye!");
                    reset = false;
                    reRun = false;
                } else {
                    System.out.println("Wrong input!");
                }

            }
        }



        //return gallons used
        //ask if they wanna reset
    }
}
