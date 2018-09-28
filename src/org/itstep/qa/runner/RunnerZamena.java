package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Zamena;

public class RunnerZamena {
    public static void main(String[] args) {
        Zamena zamena = new Zamena();
        zamena.strOne = "бяка бука бяка бука бяка бука";

        zamena.zamenaInString();
    }
}
