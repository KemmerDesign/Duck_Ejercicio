package org.example.quackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("El pato no hace sonidos");
    }
}
