import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;

public class Square extends JButton {
    private Color drawColor;
    private int borderSize;

    //for storing grid position
    private int row;
    private int col;

    public Square(int width, int height, Color color, int row, int col) {
        drawColor = color;
        borderSize = 1;
        this.row = row;
        this.col = col;
        setMinimumSize(new Dimension(width, height));
        setPreferredSize(new Dimension(width, height));
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setDrawColor(Color drawColor) {
        this.drawColor = drawColor;
    }

    @Override
	protected void paintComponent(Graphics g) {

        //black square for border
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        //green square for background
        g.setColor(Color.GREEN);
        g.fillRect(borderSize, borderSize, getWidth() - borderSize, getHeight() - borderSize);

        //black circle for piece border
        if (drawColor != Color.GREEN) {
            g.setColor(Color.BLACK);
            g.fillOval(borderSize * 3, borderSize * 3, getWidth() - borderSize * 6, getHeight() - borderSize * 6);
        }

        //middle circle for piece
        g.setColor(drawColor);
        g.fillOval(borderSize * 3 + 1, borderSize * 3 + 1,
                getWidth() - borderSize * 6 - 2, getHeight() - borderSize * 6 - 2);

    }

}
