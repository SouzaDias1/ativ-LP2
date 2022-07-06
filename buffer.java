package multihreads;
public interface Buffer {
	public void putBuffer(int value) throws InterruptedException;
	public int getBuffer() throws InterruptedException;
}
