package proxy.dynamic;

public class Car implements Vehicle{

	@Override
	public void move() {
		try {
			System.out.println("��ʻ��...");
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
