package chapter_01.chapter_01_13;

public class Main {

	public static void main(String[] args) {
		MyThreadFactory factory = new MyThreadFactory("myThreadFactory");
		Task task = new Task();
		Thread thread;
		System.out.println("Starting the Threads\n");
		for (int i = 0; i < 10; i++) {
			thread = factory.newThread(task);
			thread.start();
		}

		System.out.printf("Factory stats: \n");
		System.out.printf("%s\n", factory.getStats());
	}

}
