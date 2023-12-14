package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Animal {

    protected long id;
    protected String name;
    protected int age;
    protected double weight;
    protected ArrayList<String> abilities;

    public Animal(long id, String name, int age, double weight, ArrayList<String> abilities){
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = abilities;
    }
    public int getId() {
        return (int) id;
    }

   
    public String sound(){
        return "";
    }
    
///se ability esta em abilities exibir de forma formatada
 ///se ability está em abilities exibir this.name + can + ability
 ///se nao exibir this.name + can't + ability
 public String performAbility(String ability) {
    if (abilities.contains(ability)) {
        return name + " can " + ability;
    } else {
        return name + " can't " + ability;
         }
    }
 }
