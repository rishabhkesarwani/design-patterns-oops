package com.rishabhkesarwani;

import java.util.Scanner;

public class UpDelivery {

    public static void main(String[] args) {

        System.out.println("Welcome to UpDelivery App!");
        System.out.println("Commands:");
        System.out.println("search <query> : to search nearby stores");
        System.out.println("select <store> : to select store directly");
        System.out.println("add <item> : to add item to cart");
        System.out.println("order cart : to order the items");
        System.out.println("cancel order : to cancel order");
        System.out.println("pay <totalAmount> : to pay for order");

        Scanner input = new Scanner(System.in);

        while(true) {
            if (input.hasNextLine()) {
                String line = input.nextLine();
                Command command = new Command();
                Action action = command.interpret(line);
                if (!line.equals("exit") && action != null) {
                    action.perform();
                    for (String response: action.response()) {
                        System.out.println(response);
                    }
                } else {
                    input.close();
                    break;
                }
            }
        }
    }
}
