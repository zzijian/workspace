package zzj.learning.generics;

public class MainClass {
    public static void  main(String[] args){
        Animal cat = new Cat();
        Animal bird = new Bird();
        cat.eat();
        cat.move();
        cat.talk();

        bird.eat();
        bird.move();
        bird.talk();
    }
}
