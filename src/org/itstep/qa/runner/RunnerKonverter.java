package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Konverter;

public class RunnerKonverter {
    public static void main(String[] args) {
        Konverter konverter = new Konverter();
        System.out.println(konverter.getMultiple(1,5));
        System.out.println(konverter.getMultiple(2,3));

    }
}
