package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * @author Sergo Zurabishvili(Kekelidze78@gmail.com).
 * @since 7.02.2019.
 */
/**

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
 public String pyramid(int height) {
 StringBuilder screen = new StringBuilder();
 int weight = 2 * height - 1;
 for (int row = 0; row != height; row++) {
 for (int column = 0; column != weight; column++) {
 if (row >= height - column - 1 && row + height - 1 >= column) {
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
 */
/**
 * @since 11.02.2019.
 * Рефакторинг кода.
 */
public class Paint {
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
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