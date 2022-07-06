public interface Buffer{
	public void putBuffer(int value) throws InterruptedException;
	public int getBuffer() throws InterruptedException;
	public void putBufferDouble(double value) throws InterruptedException;
	public double getBufferDouble() throws InterruptedException;
	public void putBufferString(String valorString) throws InterruptedException;
	public int getBufferString() throws InterruptedException;
}
