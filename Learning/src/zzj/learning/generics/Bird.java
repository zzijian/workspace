package zzj.learning.generics;

public class Bird extends Animal<Noodle> {

    public Bird(){
        this.food = new Noodle();
    }

    @Override
    public void move() {
        System.out.println("bird fly");
    }

    @Override
    public void talk() {
        System.out.println("bird");
    }

    @Override
    public void eat() {
        food.eat();
        food.existNoodle();
    }
}
