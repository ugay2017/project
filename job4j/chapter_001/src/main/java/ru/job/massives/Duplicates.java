package ru.job.massives;

import java.util.Arrays;

public class Duplicates {

    /**
     * Remove duplicates from String[].
     *
     * @param arr String[] to remove duplicates
     * @return String[] with unique values
     */
    public String[] removeDuplicates(String[] arr) {

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] != null && arr[i].equals(arr[j])) {
                        arr[j] = null;
                        count++;
                    }
                }
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {

                    if (arr[j] == null && arr[j + 1] != null) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = null;
                    }
                }
            }

            return Arrays.copyOf(arr, arr.length - count);
        }
    }

