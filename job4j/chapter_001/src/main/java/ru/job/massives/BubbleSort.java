package ru.job.massives;


/**
 *Создать программу для сортировки массива методом перестановки.
 */
public class BubbleSort {

    /**
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int temp = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
