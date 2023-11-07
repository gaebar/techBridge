# TechBridge OOP Part 4 Lab - ComicsApp

### Overview
ComicsApp is a Java-based application that models comic book characters. It features a simple 
class hierarchy that represents generic comic characters, superheroes, and villains. The project 
demonstrates the use of object-oriented programming principles such as inheritance, method overriding, 
and the use of the `super` keyword.

### Features
- **Class Hierarchy:** The `ComicCharacter` class is the superclass for all characters, with 
  Superhero and Villain as subclasses.
- **Method Overriding:** Both Superhero and `Villain` classes override the `act` method to provide 
  specific behaviors.
- **Use of super:** The `Superhero` class uses the `super` keyword to enhance the functionality of the 
  overridden `act` method from the `ComicCharacter` class.

### Usage
The ComicsApp class is the entry point of the application. It creates instances of ComicCharacter, Superhero, and Villain, and calls their methods to illustrate polymorphism and method overriding.

### Project Structure
- `src/comicsapp/ComicCharacter.java`: Defines the base class for all characters.
- `src/comicsapp/Superhero.java`: Defines a subclass of ComicCharacter specific to superheroes.
- `src/comicsapp/Villain.java`: Defines a subclass of ComicCharacter specific to villains.
- `src/comicsapp/ComicsApp.java`: Contains the main method and serves as the entry point of the application.