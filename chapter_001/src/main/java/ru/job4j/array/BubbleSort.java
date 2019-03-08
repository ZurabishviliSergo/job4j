package ru.job4j.array;
 /*
 *@author Sergo Zurabishvili (Kekelidze78@gmail.com);
 * @since 8.03.2019.
  */

 public class BubbleSort {
     public int[] sort(int[] a) {
         for (int i = a.length - 1; i > 0; i--) {
             for (int j = 0; j < i; j++) {
                 if (a[j] > a[j + 1]) {
                     int tmp = a[j];
                     a[j] = a[j + 1];
                     a[j + 1] = tmp;
                 }
             }
         }
         return a;
     }
 }