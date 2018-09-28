package org.itstep.qa.runner;

import org.itstep.qa.zadachi.VozvratChisla;

public class RunnerVozvratChisla {
    public static void main(String[] args) {
        VozvratChisla vozvrat = new VozvratChisla();
        System.out.println("случайное число" + vozvrat.getTwoArguments(1,15));

    }
}
