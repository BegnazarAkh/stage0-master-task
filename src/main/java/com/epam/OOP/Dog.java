package com.epam.OOP;
import com.epam.OOP.Animal;
public class Dog extends Animal {
    public Dog(){
        super("brown", 4, false);
    }

    @Override
    public String getDescription(){
        String baseDescription = super.getDescription();
        return baseDescription;
    }
}