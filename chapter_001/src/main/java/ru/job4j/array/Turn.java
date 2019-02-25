package ru.job4j.array;
 /*
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com);
 * @since 24.02.2019.
  */
 public class Turn {
     public int[] back(int[] array) {
         for (int index = 0; index < array.length / 2; index++) {
             int temp = array[index];
             array[index] = array[array.length - index - 1];
             array[array.length - index - 1] = temp;
         }
         return array;
     }
 }