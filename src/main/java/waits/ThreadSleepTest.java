package waits;

public class ThreadSleepTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution Started");

		Thread.sleep(5000);

		System.out.println("Execution in progress");

		Thread.sleep(5000);

		System.out.println("Execution ended");

	}

}
