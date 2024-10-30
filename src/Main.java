// Copyright (c) 2024 Thavindu Wijesena. All rights reserved.
public class Main {

    public static void main(String[] args) {
        Model model = new Model();

        //board for white
        new View(model, 0).createGUI();
        //board for black
        new View(model, 1).createGUI();
    }
}
