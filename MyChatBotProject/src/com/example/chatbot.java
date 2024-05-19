package com.example;

import java.util.Scanner;
import java.util.Random;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! I'm your ChatBot. How can I assist you today?");
        System.out.println("You can ask me questions or just say hello!");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // Check if user wants to end the conversation
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            }

            // Process user input
            String botResponse = getBotResponse(userInput);
            System.out.println("ChatBot: " + botResponse);
        }

        scanner.close();
    }

    private static String getBotResponse(String userInput) {
        // Simple responses based on user input
        String[] greetings = {"Hi!", "Hello!", "Hey there!", "Nice to meet you!"};
        String[] farewells = {"Goodbye!", "See you later!", "Take care!", "Goodbye! Have a nice day!"};

        // Randomly select a response
        Random random = new Random();
        int index = random.nextInt(4); // Adjust the number based on the number of responses
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            return greetings[index];
        } else if (userInput.equalsIgnoreCase("bye")) {
            return farewells[index];
        } else {
            return "I'm sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}
