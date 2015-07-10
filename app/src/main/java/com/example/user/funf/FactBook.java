package com.example.user.funf;

import java.util.Random;

/**
 * Created by User on 9/7/2015.
 */
public class FactBook {

    public String[] mFacts ={
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympics gold medal are actually mostly made of silver",
            "An eagle can kill a young deer and fly away with it.",
            "“Facebook Addiction Disorder” is a mental disorder identified by Psychologists.",
            "Human saliva has a boiling point three times that of regular water.",
            "95% of people text things they could never say in person.",
            "The French language has seventeen different words for ‘surrender’.",
            "Hewlett-Packard’s name was decided in a coin toss.",
            "In England, in the 1880’s, “Pants” was considered a dirty word."
    };

    public String getFact()
    {
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
