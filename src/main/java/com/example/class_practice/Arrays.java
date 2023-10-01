package com.example.class_practice;

public class Arrays {
    public static void main(String[] args) {
        
        // int[] age = {12, 4, 5, 2, 5};

        // System.out.println("Acecessing Elementd of Array: ");
        // System.out.println("First Element: " + age[0]);
        // System.out.println("Second Element: " +age[1]);
        
        // // Looping through an array
        // System.out.print("Using for loop: ");
        // for(int i = 0; i < age.length; i++){
        //     System.out.println(age[i]);
        // }

        // // for-each loop
        // System.out.print("Using for each-loop: ");
        // for(int a : age){
        //     System.out.print(a + " ");
        // }


        // Try It

        // ● Create three arrays in Java using any data type. Be sure that it compiles.
        // ● Access the elements and print them out.
        // ● Alter multiple values in the array
        // ● print the elements

        // Do you remember how to cycle through an array?

        String[] str = {"Hello ", "World! ", "How are you? "};

        System.out.println("String array elements:");
        for(String s : str){
            System.out.print(s);
        }
        System.out.println();  // Newline after printing all elements

        // Now, let's alter values in the array
        str[1] = "Everyone! ";
        str[2] = "What's up?";

        System.out.println("Modified string array elements:");
        for(String s : str){
            System.out.print(s);
        } 
    }
}
