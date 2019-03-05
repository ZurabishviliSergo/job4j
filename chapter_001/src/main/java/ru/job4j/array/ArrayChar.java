package ru.job4j.array;
/*
* @author Sergo Zurabishvili (Kekelidze78@gmail.com).
* @since 4.03.2019.
* Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /*
    *Проверяет,что слово начинается с префикса
    * @param prefix префикс.
    * @return если слово начинаетс с префикса.
    *
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        //Проверить, что массив data имеет первые элементы,одинаковые с value.
        for (int i = 0; i < value.length; i++) {
            if (value[i] != this.data[i]) {
                    result = false;
            }
        }
        return result;
    }
}