package multihreads;

public class unsysnchronizedBuffer implements buffer {
  private int buffer = -1;

  public void putBuffer(intvalue)
    throws InteruptedException{
      System.out.printf("Escrevendo valor: ", value);
      buffer = value;
    }
  public int getBuffer() throws InterruptedException{
    System.out.printf("Leitura valor: ", buffer);
    return buffer;
  }
}