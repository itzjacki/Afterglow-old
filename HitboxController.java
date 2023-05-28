package afterglowJar;

import java.util.ArrayList;
import java.util.List;

public class HitboxController {
	private List<Integer> hitboxQueue = new ArrayList<Integer>();
	
	public HitboxController() {
		while (hitboxQueue.size() < 8) {
			hitboxQueue.add(-1);
		}
	}
	
	public int hitboxPoll(int addToQueue) {
		while (hitboxQueue.size() < 8) {
			hitboxQueue.add(-1);
		}
		hitboxQueue.add(addToQueue);
		return hitboxQueue.remove(0);
	}
}
