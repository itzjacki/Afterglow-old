package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

public class PlayerHealth {
	private int health;
	private int hit;
	private int missed;
	
	public PlayerHealth() {
		health = 100;
		hit = 0;
		missed = 0;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void hurtPlayer() {
		missed++;
		if (health >= 10) {
			health -= 10;
		}
		else {
			health = 0;
		}
	}
	
	public void healPlayer() {
		hit++;
		if (health > 0 && health < 100) {
			health++;
		}
	}
	
	public String getHitPercentage() {
		if (missed == 0) {
			if (hit == 0) {
				return "N/A";
			}
			else {
				return "FLAWLESS";
			}
		}
		else {
			double ratio = ((double) hit/((double) hit + (double) missed)) * 100;
			String percentage;
			if (ratio < 10) {
				percentage = String.format("%.3g%n", ratio);
			}
			else {
				percentage = String.format("%.4g%n", ratio);
			}
			return percentage;
		}
	}
}
