// Copyright (c) 2024 Thavindu Wijesena. All rights reserved.
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class View {

    private Square[][] arrayLabels;
    private JFrame guiFrame;
    private Model model;
    private int playerType;  //1 for black , 0 for white
    private JLabel label;

    public View(Model m, int playerType) {
        arrayLabels = new Square[8][8];
        guiFrame = new JFrame();
        model = m;
        model.storeView(this);
        this.playerType = playerType;
    }


    public void createGUI() {

        // Close window exits
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // different player window will appear in different position
        guiFrame.setLocation(50 + playerType * 400, 50 + playerType * 50);

        //set title of the window according to the player
        if (playerType == 0) {
            guiFrame.setTitle("Reversi - white player");
        } else {
            guiFrame.setTitle("Reversi - black player");
        }

        //set label of the window according to the player
        label = new JLabel();
        if (playerType == 0) {
            label.setText("White player - click place to put piece");
        } else {
            label.setText("Black player - not your turn");
        }

        // Layout : how to layout components
        guiFrame.setLayout(new BorderLayout(0, 0));

        //middle panel with grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));

        //placing squares in the grid
        for (int i = 0; i < arrayLabels.length; i++) {
            for (int j = 0; j < arrayLabels[i].length; j++) {

                //180-degree rotation we should, must keep in mind
                Square square;
                if (playerType == 1) {
                    square = new Square(50, 50, model.getColor(i, j), 7 - i, 7 - j);
                } else {
                    square = new Square(50, 50, model.getColor(i, j), i, j);
                }
                arrayLabels[i][j] = square;

                //setting up Listener for every square
                square.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // we can only make a move if it is your turn, and it is valid
                        if (model.getTurn() == playerType && model.validMove(playerType, square.getRow(), square.getCol())) {
                            model.takeTurn(playerType, square.getRow(), square.getCol());
                        }
                    }
                });

                panel.add(arrayLabels[i][j]);
            }
        }

        //update frontend according to back end
        update();

        //set button label according to the player
        JButton button = new JButton();
        if (playerType == 0) {
            button.setText("AI (play white)");
        } else {
            button.setText("AI (play black)");
        }
        button.setFont(new Font("Ariel", Font.BOLD, 14));

        //listener for AI button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // we can only make a move if it is your turn
                if (model.getTurn() == playerType) {
                    model.bestMove(playerType);
                }
            }
        });

        //setting up frame
        guiFrame.add(label, BorderLayout.NORTH);
        guiFrame.add(panel, BorderLayout.CENTER);
        guiFrame.add(button, BorderLayout.SOUTH);

        guiFrame.pack();
        guiFrame.setVisible(true);
    }


    public void update() {

        //update square according to backend
        for (int i = 0; i < arrayLabels.length; i++) {
            for (int j = 0; j < arrayLabels[i].length; j++) {
                if (playerType == 1) {
                    arrayLabels[i][j].setDrawColor(model.getColor(7 - i, 7 - j));
                } else {
                    arrayLabels[i][j].setDrawColor(model.getColor(i, j));
                }
            }
        }

        //update labels and frame
        updateLabels();
        guiFrame.repaint();

        //game ends when there is no move available
        if (model.getTurn() != playerType && !model.hasMove(model.getTurn())) {

            //show the dialog
            JOptionPane.showMessageDialog(null, model.result());

            //reset
            model.reset();
            model.updateAllViews();
        }

    }

    //helper method to update labels
    private void updateLabels() {
        if (playerType == 0) {
            if (model.getTurn() == 0) {
                label.setText("White player - click place to put piece");
            } else {
                label.setText("White player - not your turn");
            }
        } else {
            if (model.getTurn() == 1) {
                label.setText("Black player - click place to put piece");
            } else {
                label.setText("Black player - not your turn");
            }
        }
    }
}
