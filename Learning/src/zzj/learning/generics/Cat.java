package zzj.learning.generics;

public class Cat extends Animal<Fish> {

    public Cat(){
        this.food = new Fish();
    }

    @Override
    public void move() {
        System.out.println("cat walk");
    }

    @Override
    public void talk() {
        System.out.println("cat");
    }

    @Override
    public void eat() {
        this.food.eat();
    }
}
