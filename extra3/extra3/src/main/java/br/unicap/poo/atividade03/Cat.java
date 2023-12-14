package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Cat extends Animal {
    public Cat(long id, String name, int age, double weight) {
        super(id, name, age, weight, new ArrayList<String>());
        abilities.add("Whiskers");
        abilities.add("meow");
        abilities.add("agility");
    }
    @Override
    public String sound() {
        return "meow";
    }
}
