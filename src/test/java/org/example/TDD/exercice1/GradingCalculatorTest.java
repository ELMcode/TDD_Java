package org.example.TDD.exercice1;

import org.example.TDD.exercice1.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void whenScore95AndAttendance90_GradeA() {
        GradingCalculator calc = new GradingCalculator(95, 90);
        char grade = calc.getGrade();
        Assert.assertEquals('A', grade);
    }

    @Test
    public void whenScore85AndAttendance90_GradeB() {
        GradingCalculator calc = new GradingCalculator(85, 90);
        char grade = calc.getGrade();
        Assert.assertEquals('B', grade);
    }

    @Test
    public void whenScore65AndAttendance90_GradeC() {
        GradingCalculator calc = new GradingCalculator(65, 90);
        char grade = calc.getGrade();
        Assert.assertEquals('C', grade);
    }

    @Test
    public void whenScore95AndAttendance65_GradeB() {
        GradingCalculator calc = new GradingCalculator(95, 65);
        char grade = calc.getGrade();
        Assert.assertEquals('B', grade);
    }

    @Test
    public void whenScore95AndAttendance55_GradeF() {
        GradingCalculator calc = new GradingCalculator(95, 55);
        char grade = calc.getGrade();
        Assert.assertEquals('F', grade);
    }

    @Test
    public void whenScore65AndAttendance55_GradeF() {
        GradingCalculator calc = new GradingCalculator(65, 55);
        char grade = calc.getGrade();
        Assert.assertEquals('F', grade);
    }

    @Test
    public void whenScore50AndAttendance90_GradeF() {
        GradingCalculator calc = new GradingCalculator(50, 90);
        char grade = calc.getGrade();
        Assert.assertEquals('F', grade);
    }
}
