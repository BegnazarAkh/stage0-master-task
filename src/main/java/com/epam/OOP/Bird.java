package com.epam.OOP;
import com.epam.OOP.Animal;
public class Bird extends Animal {
    public Bird(){
        super("blue", 2, true);
    }

    @Override
    public String getDescription(){
        String baseDescription = super.getDescription();
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }

}
