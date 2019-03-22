package ru.job4j.array;

/*
*@author Sergo Zurabishvili(Kekelidze78@gmail.com).
* @since 19.03.2019
*/

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data[0].length;
        boolean firstDiagonal = data[0][0];
        boolean secondDiagonal = data[0][size - 1];
        for (int i = 1; i < size; i++) {
            if ((data[i][i] != firstDiagonal) || (data[i][size - i - 1] != secondDiagonal)) {
                result = false;
                break;
            }
        }
        return result;
    }
}