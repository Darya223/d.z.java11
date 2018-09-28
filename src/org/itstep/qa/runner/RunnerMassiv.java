package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Massiv;

public class RunnerMassiv {
    public static  void main(String[] args) {
        Massiv arrays = new Massiv();

        System.out.println("Отсортированный массив: ");
        arrays.getSortArray(new int[]{10,2,7,9,11,3,5});
    }
}
