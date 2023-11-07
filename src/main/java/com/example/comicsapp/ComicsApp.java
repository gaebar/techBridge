package com.example.comicsapp;

/**
 * The ComicsApp class is the entry point of the application.
 * It demonstrates creating various comic book characters and their interactions.
 */
public class ComicsApp {
    public static void main(String[] args) {
        // Create a generic comic character
        ComicCharacter character = new ComicCharacter("Lois Lane", "DC Universe, Earth-Two");
        // Create a superhero character with specific attributes
        Superhero superhero = new Superhero("Batman", "DC Universe, Earth-Two", "Intellect and Riches");
        // Create a villain character with a specific evil plan
        Villain villain = new Villain("Bane", "DC Universe, Earth Two", "Break the Bat and take over Gotham!");

        // Introduce each character
        character.introduce();
        superhero.introduce();
        villain.introduce();

        // Each character performs an action
        character.act();
        superhero.act();
        villain.act();
    }
}
