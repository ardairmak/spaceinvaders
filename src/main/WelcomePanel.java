package main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WelcomePanel extends JPanel  {
	
	File file = new File("/sounds/startAudio.wav");
    ImageIcon image = new ImageIcon("/gameover/start.png");
    Clip clip;
    AudioInputStream audio;
	WelcomePanel(){	
		
		this.setLayout(null);
		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(image);
		imageLabel.setBounds(-15, 0, 800, 700);
		add(imageLabel);
		//setSound();
	}
	
	public void setSound() {
		try {
			audio = AudioSystem.getAudioInputStream(file);
		    clip = AudioSystem.getClip();
		    clip.open(audio);
		    clip.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void stopSound() {
		clip.stop();
	}
	
		
		
		
		
	
}

		