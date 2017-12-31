package com.rishabhkesarwani;

import java.util.ArrayList;

public class Command {

    Command(String input) {
        String[] command = input.split(" ");
        if (command.length == 2) {
            String argument = command[1];
            switch (command[0]) {
                case "search":
                    SearchAction searchAction = new SearchAction();
                    //Appropriate method to call from above object
                    break;
                case "select":
                    SelectAction selectAction = new SelectAction();
                    //Appropriate method to call from above object
                    break;
                case "add":
                    AddCartAction addCartAction = new AddCartAction();
                    //Appropriate method to call from above object
                    break;
                case "order":
                    OrderAction orderAction = new OrderAction();
                    //Appropriate method to call from above object
                    break;
                case "cancel":
                    CancelAction cancelAction = new CancelAction();
                    //Appropriate method to call from above object
                    break;
                case "pay":
                    PayAction payAction = new PayAction();
                    //Appropriate method to call from above object
                    break;
                default:
                    System.out.println("give a valid command");
            }
        } else {
            System.out.println("give a valid command");
        }
    }

}