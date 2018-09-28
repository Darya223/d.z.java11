package org.itstep.qa.zadachi;
//Создайте в классе Circle метод, вычисляющий длину окружности. Проверьте работу метода в главном классе.

public class Circle {
    private int circleRadius;

    public void valueOfRadius(int i) {
        this.circleRadius = i;
    }

    public int getValueOfRadius() {
        return circleRadius;
    }

    public double getRoundOfCircle(){

        return Math.PI*circleRadius*2;
    }

}
