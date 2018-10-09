package ru.job.massives;

/**
 *  Перевернуть массив.
 */
public class Turn {
    /**
     * back.
     *
     * @param arr исходный массив
     * @return array
     */
    public int[] turn(int[] arr) {

        for (int i = 0; arr.length / 2 > i; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}