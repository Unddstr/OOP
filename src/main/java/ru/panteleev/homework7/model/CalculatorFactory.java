package ru.panteleev.homework7.model;

public class CalculatorFactory implements ICalculatorFactory{
    @Override
    public Calculator create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }
}
