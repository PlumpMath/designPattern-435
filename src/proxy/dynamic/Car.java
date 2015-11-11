package proxy.dynamic;

public class Car implements Vehicle{

	@Override
	public void move() {
		try {
			System.out.println("ÐÐÊ»ÖÐ...");
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
