package org.example.TDD.exercice1;

public class Main {
    public static void main(String[] args) {
        GradingCalculator calc1 = new GradingCalculator(95, 90);
        System.out.println("Grade avec Score 95 et Attendance 90: " + calc1.getGrade());

        GradingCalculator calc2 = new GradingCalculator(85, 90);
        System.out.println("Grade avec Score 85 et Attendance 90: " + calc2.getGrade());

        GradingCalculator calc3 = new GradingCalculator(65, 90);
        System.out.println("Grade avec Score 65 et Attendance 90: " + calc3.getGrade());

        GradingCalculator calc4 = new GradingCalculator(95, 65);
        System.out.println("Grade avec Score 95 et Attendance 65: " + calc4.getGrade());
    }
}
