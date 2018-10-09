package ru.job.massives;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
