package ru.job4j.exercise.arrayex;
/*. Сумма элементов массива.
Доступ к элементам массива осуществляется по индексам.
Напомню, что первый элемент имеет индекс 0,
последний - имя_массива.length - 1.
 */
public class Sum {
    public static int getSum(int[] array) {
        return array[0] + array[array.length-1];
    }
}
