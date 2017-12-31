package com.rishabhkesarwani;

import java.util.ArrayList;

public interface Action {

    public void perform(String argument);

    public ArrayList<String> response();

}