package com.example.comicsapp;

/**
 * The ComicCharacter class represents a generic character in a comic book.
 */
public class ComicCharacter {
    private final String name; // The name of the character
    private final String universe; // The universe where the character resides

    /**
     * Constructs a new ComicCharacter with a name and universe.
     * @param name The name of the character.
     * @param universe The universe of the character.
     */
    public ComicCharacter(String name, String universe) {
        this.name = name;
        this.universe = universe;
    }

    /**
     * Introduces the character with their name and universe.
     */
    public void introduce() {
        System.out.println("I am " + this.name + " from the " + this.universe);
    }

    /**
     * Describes the character's action, to be more specific in subclasses.
     */
    public void act() {
        System.out.println(this.name + " is doing something!");
    }

    /**
     * Gets the name of the character.
     * @return The name of the character.
     */
    public String getName() {
        return this.name;
    }
}
