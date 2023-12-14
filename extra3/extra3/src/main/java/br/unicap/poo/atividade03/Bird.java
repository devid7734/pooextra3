package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Bird extends Animal {
    public Bird(long id, String name, int age, double weight) {
        super(id, name, age, weight, new ArrayList<String>());
        abilities.add("Tweety");
        abilities.add("piu");
        abilities.add("fly");
    }
    @Override
    public String sound() {
        return "piu";
    }
}

