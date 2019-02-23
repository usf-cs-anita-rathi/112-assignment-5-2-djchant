package Chapter5Section2;

import java.util.Scanner;

public class Odometer {

    private double milesDriven;
    private double mpg;
    private double gallons;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void setmpg(double mpg) {
        this.mpg = mpg;
    }

    public void resetOdometer() {
        milesDriven = 0;
        System.out.println("Miles driven is now: " + milesDriven);
    }

    public double getGallonsUsed() {
        gallons = milesDriven / mpg;
        return gallons;
    }

    public void milesOdometer(double miles) {
        milesDriven += miles;
    }


}
