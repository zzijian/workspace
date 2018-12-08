package zzj.learning.generics;

public abstract class Animal<T extends Food> {
    protected T food;

    public abstract void move();
    public abstract void talk();
    public abstract void eat();
}
