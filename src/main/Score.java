package main;
public class Score{
   
   private String username;
   private int score;
   
   Score(String username,int score){
	   this.username = username;
	   this.score = score;
   }
   
   public int getScore() {
	   return score;
   }
   
   public void setScore(int score) {
	   this.score = score;
   }
   
   public String getUsername() {
	   return username;
   }
   
   public void setUsername(String username) {
	   this.username = username;
   }
   
}