package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener {

    private boolean leftButtonClicked;
    private boolean rightButtonClicked;
    
    private int mouseX;
    private int mouseY;
     
    private GamePanel gp;

    public MouseHandler(GamePanel gp) {
        
    	this.gp = gp;
    	leftButtonClicked = false;
        rightButtonClicked = false;
        mouseX = 0;
        mouseY = 0;
 
    }

    public boolean isLeftButtonClicked() {
        return leftButtonClicked;
    }

    public boolean isRightButtonClicked() {
        return rightButtonClicked;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int button = e.getButton();

        if (button == MouseEvent.BUTTON1) {
            leftButtonClicked = true;
        } else if (button == MouseEvent.BUTTON3) {
            rightButtonClicked = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int button = e.getButton();

        if (button == MouseEvent.BUTTON1) {
            leftButtonClicked = false;
        } else if (button == MouseEvent.BUTTON3) {
            rightButtonClicked = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();

    }

}
