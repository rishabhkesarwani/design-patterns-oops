package com.rishabhkesarwani;

public class Command {

    public Action interpret(String input) {
        String[] command = input.split(" ");
        Action action = null;
        if (command.length == 2) {
            String argument = command[1];
            switch (command[0]) {
                case "search":
                    action = new SearchAction(argument);
                    break;
                case "select":
                    action = new SelectAction(argument);
                    break;
                case "add":
                    action = new AddCartAction(argument);
                    break;
                case "order":
                    action = new OrderAction(argument);
                    break;
                case "cancel":
                    action = new CancelAction(argument);
                    break;
                case "pay":
                    action = new PayAction(argument);
                    break;
                default:
                    System.out.println("give a valid command");
            }
        } else {
            System.out.println("give a valid command");
        }
        return action;
    }

}