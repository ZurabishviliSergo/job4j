package ru.job4j.puzzle;

import ru.job4j.puzzle.firuges.Cell;
import ru.job4j.puzzle.firuges.Figure;

/**
 * //TODO add comments.
 *
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @version $Id$.
 * @since 20.04.2019.
 */
public class Logic {
    private final int size;
    private final Figure[] figures;
    private int index = 0;

    public Logic(int size) {
        this.size = size;
        this.figures = new Figure[size * size];
    }

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (this.isFree(steps)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
            }
        }
        return rst;
    }

    public boolean isFree(Cell ... cells) {
        boolean result = cells.length > 0;
        for (Cell cell : cells) {
            if (this.findBy(cell) != -1) {
               result = false;
               break;
            }
        }
        return result;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public boolean isWin() {
        int[][] table = this.convert();
        boolean result = false;

//        for (int[] t: table) {
//            if ((t[0] == 1)) {
//                result = true;
//                for (int j = 0; j < t.length - 1; j++) {
//                    if (t[j] != t[j + 1]) {
//                        result = false;
//                        break;
//                    }
//                }
//            }
//
//        }
//        if (!result) {
//            for(int i = 0; i < table.length; i++) {
//                if ((table[0][i] == 1)) {
//                    result = true;
//                    for (int j = 0; j < table[i].length - 1; j++) {
//                        if (table[j][i] != table[j + 1][i]) {
//                            result = false;
//                            break;
//                        }
//                    }
//                }
//            }
//        }


        for(int i = 0; i < table.length; i++) {
            int g = 0;
            int v = 0;
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 1) {
                g++;
                }
                if (table[j][i] == 1) {
                   v++;
                }
            }
            if (g == 0 || v == 0) {
                result = true;
                break;//тут напиши проверку что счетчики равны длине массива если да то брейк если нет то на след круг
            }
//как бы все. все работает
        }
        return result;
    }

//можно сразу и горизонталь и вертикаль проверять
    //сделай два цикла и два счетчика

    public int[][] convert() {
        int[][] table = new int[this.size][this.size];
        for (int row = 0; row != table.length; row++) {
            for (int cell = 0; cell != table.length; cell++) {
                int position = this.findBy(new Cell(row, cell));
                if (position != -1 && this.figures[position].movable()) {
                    table[row][cell] = 1;
                }
            }
        }
        return table;
    }
}
