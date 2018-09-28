package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("было:" +circle.getValueOfRadius());
        circle.valueOfRadius(10);
        System.out.println("стало:" + circle.getValueOfRadius());
        System.out.println("окружность:" + circle.getRoundOfCircle());

    }
}
