package org.example.quackBehavior;

public class Squeack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("El pato hace Squack");
    }
}
