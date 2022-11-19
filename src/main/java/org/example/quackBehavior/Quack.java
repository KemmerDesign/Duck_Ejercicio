package org.example.quackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("El pato hace quack");
    }
}
