package ru.job;
/**
 *Подсчет суммы чётных чисел в диапазоне
 */
public class Counter {
    /**
     * @param start
     * @param finish
     * @return
     */
public int add(int start, int finish) {
    int sum = 0;
    for (int i = start; i < finish; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    return sum;
    }
}
