package main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class GameOverPanel extends JPanel {
    private ImageIcon[] images;
    private JLabel imageLabel;
    private int currentIndex;
    private Clip gameoverClip;

    public GameOverPanel() {
        setLayout(null);
        initializeImages();
        initializeComponents();
        startAnimation();
        loadGameOverSound();
        
    }

    private void initializeImages() {
        images = new ImageIcon[3];
        images[0] = new ImageIcon(getClass().getResource("/gameover/gameOverUp.png"));
        images[1] = new ImageIcon(getClass().getResource("/gameover/gameOverMid.png"));
        images[2] = new ImageIcon(getClass().getResource("/gameover/gameOverDown.png"));
    }
    public void loadGameOverSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/sounds/gameOver.wav"));
            gameoverClip = AudioSystem.getClip();
            gameoverClip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void playGameOverSound() {
        if (gameoverClip != null) {
            gameoverClip.setFramePosition(0);
            gameoverClip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    private void initializeComponents() {
        currentIndex = 0;
        imageLabel = new JLabel();
        imageLabel.setIcon(images[currentIndex]);
        imageLabel.setBounds(-40, 0, 850, 576);
        add(imageLabel);
    }
    private void startAnimation() {
        int delay = 900;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            	    currentIndex = (currentIndex + 1) % images.length;
            	    imageLabel.setIcon(images[currentIndex]);
            }
        }, delay, delay);
    }
}
