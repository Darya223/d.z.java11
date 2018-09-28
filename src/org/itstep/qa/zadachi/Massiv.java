package org.itstep.qa.zadachi;
//Создать метод, который будет сортировать передаваемый массив по возрастанию и возвращать отсортированный массив.
import java.util.Arrays;
public class Massiv {

    public int[] getSortArray(int[] myArray){
        Arrays.sort(myArray,0,myArray.length);
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i] + " ");
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}


