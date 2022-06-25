package MainMultiThreads;

public class MainMultiThreads {

  public static void MainMultiThreads (String() args)
  throws InterruptedException {
    ExecutorService threadRun = buffer sharedLocation = new unsysnchronizedBffer()
      System.out.printf("Thread running \t\tValue\t" + Sum write\tSum read\n);

    System.out.println("---------------------------------------");
    threadRun.excute(new writeBuffer(saredLocation));
    threadRun.excute(new readBuffer(saredLocation));
    threadRun.shutdown();
    threadRun.awaitTermination(1, TimeUnit.MINUTES);
}