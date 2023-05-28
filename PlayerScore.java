package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

public class PlayerScore {
	private int score;
	private int combo;
	
	public PlayerScore() {
		score = 0;
		combo = 1;
	}
	
	public int getScore() {
		return score;		
	}
	
	public int getCombo() {
		return combo;
	}
	
	public void addScore() {
		score += 100 * combo;
		combo++;
	}
	
	public void killCombo() {
		combo = 1;
	}
}
