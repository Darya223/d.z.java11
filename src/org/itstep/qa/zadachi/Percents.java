package org.itstep.qa.zadachi;

import java.util.Arrays;

//Напишите метод, увеличивающий элементы массива на 10%. Определите, какие у этого метода входные и выходные данные.
// Решите сами, должен ли метод изменять исходный массив, или в результате работы будет создаваться новый.
public class Percents {
    public double[] getIncreaseArray(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += myArray[i] * 0.1;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
