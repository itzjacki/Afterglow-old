package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

public class BulletController {
	private static BulletPattern bulletPattern = new BulletPattern();
	private static int waitRemaining = 24; //Ticks som går før noe skjer (må være minst 1!)
	
	public BulletController() {
	}
	
	public static int getNextAction() {
		waitRemaining--;
		if (waitRemaining == 0) {
			int[] nextBulletWithWait = bulletPattern.getNextBullet();
			waitRemaining = nextBulletWithWait[1];
			return nextBulletWithWait[0];
		}
		else {
			return -1;
		}
	}
	
	public static void resetBulletController() {
		bulletPattern = new BulletPattern();
		waitRemaining = 24;
	}
}
