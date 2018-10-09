package ru.job;

/**
 * Построить шахматную доску в псевдографике
 */
public class Board {
    /**
     * @param width
     * @param height
     * @return
     */
    public String paint(int width, int height) {
    StringBuilder screen = new StringBuilder();
    String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if ((i + j) % 2 == 1) {
                screen.append(' ');
            } else {
                screen.append("X");
            }
        }
        // добавляем перевод на новую строку.
        screen.append(ln);
    }
            return screen.toString();
    }
}
