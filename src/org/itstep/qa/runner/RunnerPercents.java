package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Percents;

public class RunnerPercents {
    public static void main(String[] args) {
        Percents arrays = new Percents();

        System.out.println("Увеличенный массив: ");
        arrays.getIncreaseArray(new double[]{2,5,7,15,9,4,13});
    }
}
