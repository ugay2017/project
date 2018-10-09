package ru.job.massives;
/**
 * Квадратный массив заполнен true или false по диагоналям.
 */
public class MatrixCheck {

    /**
     * @param data
     * @return
     */
    public boolean mono(boolean[][] data) {
        boolean result = true, temp = data[0][0];
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != temp) || (data[data.length - 1 - i][i] != temp)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
