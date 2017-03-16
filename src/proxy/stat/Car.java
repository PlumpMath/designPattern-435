package proxy.stat;

public class Car implements Vehicle{

	@Override
	public void move() {
		try {
			System.out.println("开始启动。。。");
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
