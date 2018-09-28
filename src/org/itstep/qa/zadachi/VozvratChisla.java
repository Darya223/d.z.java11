package org.itstep.qa.zadachi;
//Создать метод, который будет принимать два целочисленных параметра a и b, будет возвращать случайное целое число из отрезка [a;b].
public class VozvratChisla {
    public int getTwoArguments(int a, int b) {
        if(a>b){
                int c=(int)(Math.random()*(a-b+1))+b;
                return c;
            }
            else {
                int c=(int)(Math.random()*(b-a+1))+a;
                return c;
            }
        }
}

