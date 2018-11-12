package Lessonses.Circle.Interfaces;

public interface Imfo {

    default void log(String str){
        System.out.println("Метод по умолчанию. Логгируем: " + str);
    }

    static boolean isNull(String str) {
        System.out.println("Статический метод проверки на null");

        return str == null ? true : "".equals(str) ? true : false;
    }

    public void showInfo();


}
