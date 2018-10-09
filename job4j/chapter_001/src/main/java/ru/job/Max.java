package ru.job;
/**
 * Max.
 *
 * @author Ugay Stas(ugay8010@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * method maxTwo parametres
     * @param first
     * @param second
     */
    public int maxTwo(int first, int second) {
        return (first > second) ? first : second;
    }
    /**
     * method maxThree parametres
     * @param first
     * @param second
     * @param third
     */
    public int maxThree(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }
}
