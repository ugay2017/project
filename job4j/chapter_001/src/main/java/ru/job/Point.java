package ru.job;

/**
 * Расстояние между точками в системе координат
 */
public class Point {
    /**
     * поле для храниия {@code X} координаты точки
     */
    public double x;

    /**
     * поле для храниия {@code Y} координаты точки
     */
    public double y;

    /**
     * создает обьект {@code Point}
     *
     * @param x значение {@code x} координаты {@code Point} обьекта.
     * @param y значение {@code y} координаты {@code Point} обьекта.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * высчитывает расстояние к заданой точке {@code Point}
     *
     * @param point {@code Point} обьект к которому нужно посчитать расстояние
     * @return расстояние от текущей до заданой точки
     */
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(Math.abs((this.x - point.x)), 2) + Math.pow(Math.abs((this.y - point.y)), 2));
    }
}
