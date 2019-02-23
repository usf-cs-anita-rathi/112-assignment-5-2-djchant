package Chapter5Section2;

import java.util.Scanner;

public class GradingMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grading grading = new Grading();

        System.out.print("Grade for quiz one: ");
        int quizOne = input.nextInt();
        System.out.print("Grade for quiz two: ");
        int quizTwo = input.nextInt();
        System.out.print("Grade for quiz three: ");
        int quizThree = input.nextInt();
        System.out.print("Grade for midterm: ");
        int midterm = input.nextInt();
        System.out.print("Grade for final exam: ");
        int finalExam = input.nextInt();
        grading.numericGrade(quizOne, quizTwo, quizThree, midterm, finalExam);
        grading.letterGrade(grading.numericGradePercentage);
        System.out.println(grading);

    }
}
