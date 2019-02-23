package Chapter5Section2;

        import java.util.Scanner;

public class TemperatureMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperature temperature = new Temperature();

        System.out.print("TempA temperature: ");
        float tempA = input.nextFloat();
        System.out.print("TempA scale: ");
        String tempAScale = input.next();

        System.out.print("TempB temperature: ");
        float tempB = input.nextFloat();
        System.out.print("TempB scale: ");
        String tempBScale = input.next();

        temperature.equal(tempA, tempAScale, tempB, tempBScale);
        temperature.greaterThan(tempA, tempAScale, tempB, tempBScale);
        temperature.lessThan(tempA, tempAScale, tempB, tempBScale);

    }
}
