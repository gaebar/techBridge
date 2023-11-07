package com.example.comicsapp;

/**
 * The Superhero class extends the ComicCharacter class to represent characters
 * with superpowers.
 */
public class Superhero extends ComicCharacter {
    private final String superpower; // The unique superpower of the superhero

    /**
     * Constructs a new Superhero with a name, universe, and superpower.
     * @param name The name of the superhero.
     * @param universe The universe where the superhero resides.
     * @param superpower The unique superpower of the superhero.
     */
    public Superhero(String name, String universe, String superpower) {
        super(name, universe);
        this.superpower = superpower;
    }

    /**
     * Performs the superhero's action, which includes using their superpower.
     */
    @Override
    public void act() {
        super.act();
        System.out.println("Using my superpower: " + this.superpower);
    }
}
