import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainMultiThreads{

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService  threadRun = Executors.newCachedThreadPool();
		Buffer sharedLocation = new UnsysnchronizedBuffer();
		
		System.out.printf(
			"Thread running\t\tValue\t "
			+ "Sum write\tSum read\n"
		);

		System.out.println("-------------------------------------------------------------------------------------");
		threadRun.execute(new writeBuffer(sharedLocation));
		threadRun.execute(new readBuffer(sharedLocation));
		threadRun.execute(new writeBufferDouble (sharedLocation));
		threadRun.execute(new readBufferDouble (sharedLocation));
		threadRun.execute(new writeBufferString (sharedLocation));
		threadRun.execute(new readBufferString (sharedLocation));
		threadRun.shutdown();
		threadRun.awaitTermination(1, TimeUnit.MINUTES);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.printf(
			"Thread running\t\t\tIs\t\t\tClosing\n\n"
		);
	}

}
