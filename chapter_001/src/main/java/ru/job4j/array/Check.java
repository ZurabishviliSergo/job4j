package ru.job4j.array;
/*
*@author Sergo Zurabishvili (Kekelidze78@gmil.com);
*@since 25.02.2019.
* Массив заполнен true или false
 */

public class Check {
    public boolean mono(boolean[] data) {
        for (boolean v:data) {
            if (data[0] != v) {
                return false;
            }
        }
        return true;
    }
}