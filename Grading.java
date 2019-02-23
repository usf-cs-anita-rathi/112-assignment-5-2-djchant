package Chapter5Section2;

import java.text.DecimalFormat;

public class Grading {
    public double numericGradePercentage;
    public String letterGradeLetter;
    DecimalFormat numberFormat = new DecimalFormat("##0.00");

    public String getLetterGrade() {
        return letterGradeLetter;
    }

    public double getNumericGrade() {
        return numericGradePercentage;
    }

    public void setLetterGrade(String letter) {
        this.letterGradeLetter = letter;
    }

    public void setNumericGrade(double numeric) {
        this.numericGradePercentage = numeric;
    }

    public void numericGrade(int quizOne, int quizTwo, int quizThree, int midterm, int finalExam) {
        double finalExamGrade = (finalExam / 100.0) * 40;
        double midtermGrade = (midterm / 100.0) * 35;
        double quizGrade = ((quizOne + quizTwo + quizThree) / 300.0) * 25;
        setNumericGrade(finalExamGrade + midtermGrade + quizGrade);
    }

    public void letterGrade(double num) {
        if(num >= 90.0) {
            setLetterGrade("A");
        } else if(num >= 80.0) {
            setLetterGrade("B");
        } else if(num >= 70.0) {
            setLetterGrade("C");
        } else if(num >= 60) {
            setLetterGrade("D");
        } else {
            setLetterGrade("F");
        }
    }

    public String toString() {
        return ("Your numeric grade is: " + numberFormat.format(numericGradePercentage) + " and your letter grade is: " + letterGradeLetter);
    }
}
