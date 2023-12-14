package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Dog extends Animal {
    public Dog(long id, String name, int age, double weight) {
        super(id, name, age, weight, new ArrayList<String>());
        abilities.add("Buddy");
        abilities.add("au");
        abilities.add("sniff");
    }
    @Override
    public String sound() {
        return "au";
    }
}


