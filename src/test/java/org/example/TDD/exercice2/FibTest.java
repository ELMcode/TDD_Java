package org.example.TDD.exercice2;

import org.example.TDD.exercice2.Fib;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class FibTest {

    @Test
    public void whenRangeIs1_ResultIsNotEmpty() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void whenRangeIs1_ResultContainsZero() {
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRangeIs6_ResultContainsSixElements() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(6, result.size());
    }

    @Test
    public void whenRangeIs6_ResultContainsThree() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void whenRangeIs6_ResultDoesNotContainFour() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void whenRangeIs6_ResultIsCorrect() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);
        Assert.assertEquals(expected, result);
    }

    // TODO : test 'whenRangeIs6_ResultIsAscending', boucle ?


}
