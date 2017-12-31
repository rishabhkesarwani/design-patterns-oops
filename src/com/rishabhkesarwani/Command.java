package com.rishabhkesarwani;

import java.util.ArrayList;

public class Command {

    private Action action;
    private String argument;

    Command(String input) {
        String[] command = input.split(" ");
        if (command.length == 2) {
            argument = command[1];
            switch (command[0]) {
                case "search":
                    action = new SearchAction();
                    break;
                case "select":
                    action = new SelectAction();
                    break;
                case "add":
                    action = new AddCartAction();
                    break;
                case "order":
                    action = new OrderAction();
                    break;
                case "cancel":
                    action = new CancelAction();
                    break;
                case "pay":
                    action = new PayAction();
                    break;
                default:
                    System.out.println("give a valid command");
            }
        } else {
            System.out.println("give a valid command");
        }
    }

    public void execute() {
        action.perform(argument);
    }

    public ArrayList<String> response() {
        return action.response();
    }

}