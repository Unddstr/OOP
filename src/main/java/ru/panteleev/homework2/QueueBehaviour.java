package ru.panteleev.homework2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
