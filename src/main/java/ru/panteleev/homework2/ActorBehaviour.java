package ru.panteleev.homework2;

public interface ActorBehaviour {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);

    boolean isMakeOrder();
    boolean isTakeOrder();

}