package com.example.comicsapp;

/**
 * The Villain class extends the ComicCharacter class to represent characters
 * with evil intentions.
 */
public class Villain extends ComicCharacter {
    private final String evilPlan;

    /**
     * Constructs a new Villain with a name, universe, and an evil plan.
     * @param name The name of the villain.
     * @param universe The universe where the villain operates.
     * @param evilPlan The detailed plan the villain intends to execute.
     */
    public Villain(String name, String universe, String evilPlan) {
        super(name, universe);
        this.evilPlan = evilPlan;
    }

    /**
     * Performs the villain's action, which includes executing their evil plan.
     */
    @Override
    public void act() {
        System.out.println("I am " + getName() + " and I am executing my evil plan: " + this.evilPlan);
    }
}
