package ru.job4j.loop;
/**
 * @author Sergo Zurabishvili(Kekelidze78@gmail.com).
 * @since 7.02.2019.
 */

public class Paint {
    public String rightTrl(int height) {
        //Буфер для результата.
        StringBuilder screen = new StringBuilder();
        //Ширина будет равно высоте.
        int weght = height;
        //внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            //внутренний цикл определяет положения чейки в строке.
            for (int column = 0; column != weght; column++) {
                //если строка равна ячейке,то рисуем галку.
                //В данном случае строка опрделяет,сколько галок будет на строке.
                if (row >= column) {
                    screen.append("^");
                }
                else {
                    screen.append(" ");
                }
            }
            //Добавляем перевод строки
            screen.append(System.lineSeparator());
        }
        //Получаем результат
        return screen.toString();
    }
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                 screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}