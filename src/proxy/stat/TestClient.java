package proxy.stat;

public class TestClient {
	public static void main(String[] args) {
		Car car = new Car();
		LogProxy proxy = new LogProxy(car);
		proxy.move();
	}
}
