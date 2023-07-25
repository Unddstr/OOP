package ru.panteleev.homework2;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public Actor(String name){
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }
    String getName(){
        return this.name;
    }
}
