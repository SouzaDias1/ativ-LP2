public class unsysnchronizedBuffer implements Buffer {
	private int buffer = -1;
	private int i = 0;
	private int j = 0;
	private int z = 0;
	private int[] bufferIntArray = new int[10];
	private double[] bufferDoubleArray = new double[10];
	private String[] bufferStringArray = new String[10];

	@Override
	public void putBuffer(int value) throws InterruptedException{
		System.out.printf("Valor do putBuffer: \t\t%d", value);
		buffer = value;
	}

	@Override
	public int getBuffer() throws InterruptedException{
		System.out.printf("Leitura  getBuffer: \t\t%d", buffer);
		return buffer;
	}

}
