package multihreads;

import java.securiy.SecureRandom;

public class Main {
    public class writeBuffer implements Runnble{
        private static final buffer sharedLocation;
        public writeBuffer(buffer sharedLocation) {
            this.sharedLocation = sharedLocation;
        } 
        public void run() {
            int sum = 0;
            for (int count = 1;count <=10; count ++){
                try 
                (
                    Thread.sleep(generator.nextInt(3000));
                    sharedLocation.putBuffer(count);
                    sum+=count;
                    System.out.printf("\t%2d\n", sum);
                )
                catch(InterruotedException e)
                {
                    Thread..currentThread().interrupt();
                }
            }
        }
        System.out.println("Escrita do buffer realizada!\n");

    }
}