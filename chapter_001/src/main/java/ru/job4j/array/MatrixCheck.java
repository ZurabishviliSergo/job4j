package ru.job4j.array;

/*
*@author Sergo Zurabishvili(Kekelidze78@gmail.com).
* @since 19.03.2019
*/

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[1][1] != data[i][i] || data[1][1] != data[data.length - 1 - i][i]) {
                result = false;
                return result;
            }
        }
        return result;
    }
}