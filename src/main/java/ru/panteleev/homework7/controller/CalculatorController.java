package ru.panteleev.homework7.controller;

import ru.panteleev.homework7.model.CalculatorFactory;
import ru.panteleev.homework7.model.CalculatorLogger;
import ru.panteleev.homework7.model.ICalculatorFactory;
import ru.panteleev.homework7.model.ICalculatorLogger;
import ru.panteleev.homework7.view.CalculatorView;
import ru.panteleev.homework7.view.ICalculatorView;

public class CalculatorController {

        ICalculatorFactory icalculatorFactory;
        ICalculatorLogger icalculatorLogger;
        ICalculatorView icalculatorView;
    public CalculatorController() {
        this.icalculatorFactory = new CalculatorFactory();
        this.icalculatorLogger = new CalculatorLogger();
        this.icalculatorView = new CalculatorView(icalculatorFactory, icalculatorLogger);
    }

    public void run(){
        icalculatorView.run();
    }
}
