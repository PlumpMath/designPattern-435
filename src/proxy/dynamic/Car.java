package proxy.dynamic;

public class Car implements Vehicle{
	private int height;

	@Override
	public void move() {
		try {
			System.out.println("行驶中...");
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
