package main;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HighScorePanel extends JPanel{
	
	
	ArrayList<Score> scores = new ArrayList<>();
	JLabel titleLabel = new JLabel();
	ArrayList<JLabel> scoreLabels = new ArrayList<>();
	
	HighScorePanel(){
		this.setLayout(new GridLayout(10,1,0,0));
		titleLabel.setText("HIGH SCORES");
		titleLabel.setFont(new Font("MV Boli",Font.BOLD,40));
		titleLabel.setForeground(Color.green);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setBackground(Color.black);
		add(titleLabel);
		sortHighScores();
		displayScores();
		
		}
		
		
    public void sortHighScores() {
		
    	ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("highscores.txt"))) {
		
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
		}
            catch(IOException e) {
            	
            }
		for(String line : lines) {
			String[] tokens = line.split(" ");
			if (tokens.length >= 2) {
				String username = tokens[0];
				int score = Integer.parseInt(tokens[1]);
				scores.add(new Score(username,score));
			}
		}
		
		scores.sort(new Comparator<Score>() {
			public int compare(Score score1,Score score2) {
				return Integer.compare(score1.getScore(), score2.getScore());
			}
		});
		}
    public void displayScores() {
    	for(int i = 0; i < Math.min(10, scores.size());i++)  {
    		Score score = scores.get(i);
    		
    		//DISPLAY ZEROS BEFORE THE SCORE IF ITS LESS THAN 6 DIGIT
    	    String username = score.getUsername();
    	    String scoreText = String.format("%06d",score.getScore());
    	    String labelText = String.format("<html><pre>%-" + 15 + "s%s</pre></html>", username, scoreText);
    		
    	    JLabel label = new JLabel(labelText);
    		label.setFont(new Font("Arial",Font.BOLD,30));
    		label.setHorizontalAlignment(SwingConstants.CENTER);
    		label.setForeground(Color.white);
    		scoreLabels.add(label);
    }
    	for(int j=scoreLabels.size()-1;j>=0;j--) {
    		this.add(scoreLabels.get(j));
    	}
    	
    
		
	}
}

