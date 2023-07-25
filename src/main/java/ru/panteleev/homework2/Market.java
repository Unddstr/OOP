package ru.panteleev.homework2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " stal v ochered");
        this.queue.add(actor);
    }
    @Override
    public void takeOrder() {
        for (Actor actor: queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " sdelal zakaz");
            }
        }
    }
    @Override
    public void giveOrder() {
        for (Actor actor: queue){
            if(!actor.isTakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " poluchil svoi zakaz");
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " vishel iz ocheredi");
            }
        }
        releaseFromMarket(releasedActors);
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " prishel v magazin");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            System.out.println(actor.getName() + " vishel iz magazina");
            queue.remove(actor);
        }
    }
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
