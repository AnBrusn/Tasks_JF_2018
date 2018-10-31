package brusnitsyna.fifth;

public class FourthTask {
	public static void main(String[] args) {
		try {
			NuclearSubmarine submarine = new NuclearSubmarine(500);
			submarine.swim();
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
