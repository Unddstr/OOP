package ru.panteleev.homework2;

public class Human extends Actor{

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    public void setMakeOrder(boolean status) {
        super.isMakeOrder = status;
    }

    @Override
    public void setTakeOrder(boolean status) {
        super.isTakeOrder = status;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
