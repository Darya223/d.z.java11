package org.itstep.qa.zadachi;
//Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».

public class Zamena {
    public String strOne;
    public String strAfter;

    public void zamenaInString() {
        String strAfter = strOne.replace("бяка", "вырезано цензурой");
        System.out.println(strAfter);
    }
}
