package ru.job;
/**
 * Calculator.
 *
 * @author Ugay Stas(ugay8010@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * поле для храниия {@code result}
     */
    private double result;
    /**
     * method add
     * @param first
     * @param second
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * method getResult
     * @return сложение двух чисел
     */
    public double getResult() {
        return this.result;
    }
}
