package com.epam.OOP;
import com.epam.OOP.Animal;
public class Dog extends Animal {
    public Dog(){
        super("blue", 2, false);
    }

    @Override
    public String getDescription(){
        String baseDescription = super.getDescription();
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }
}