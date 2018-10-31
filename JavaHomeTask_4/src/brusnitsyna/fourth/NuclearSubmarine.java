package brusnitsyna.fourth;

public class NuclearSubmarine {
	public int depth_;
	
	public NuclearSubmarine(int depth) {
		depth_ = depth;
	}
	
	public void swim() {
		SubmarineEngine engine = new SubmarineEngine();
		engine.powerOn();
	}
	
	public class SubmarineEngine {
		public void powerOn() {
			if (depth_ > 1027) {
				throw new IllegalArgumentException("It's too deep, we have to go back");
			}
			System.out.print("We need to go deeper");
		}
	}
	
}
