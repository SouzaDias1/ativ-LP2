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

	@Override
	public void putBufferDoubleArray(double value) throws InterruptedException {
		System.out.printf("Escrita valor putBufferDoubleArray: \t\t%,.2f", value);
		int i = (int) value;
		bufferDoubleArray[i-1] = value;
	}

	@Override
	public double getBufferDoubleArray() throws InterruptedException {
		double readValue = bufferDoubleArray[j];
		System.out.printf("Leitura valor do getBufferDoubleArray: \t\t%,.2f", readValue);
		if(j != 10) {
			if(readValue != 0 && bufferDoubleArray[j+1] != 0) j++;
		}
		return readValue;
	}

	@Override
	public void putBufferStringArray(int indice) throws InterruptedException {
		System.out.printf("Escrita valor do putBufferStringArray: \t\t%d", indice);
		String value = String.valueOf(indice);
		bufferStringArray[indice-1] = value;
	}

	@Override
	public int getBufferStringArray() throws InterruptedException {
		int actualValue;
		System.out.printf("Leitura valor do getBufferStringArray: \t\t%s", bufferStringArray[z]);
		if(bufferStringArray[z] == null) actualValue = 0;
		else {
			actualValue = Integer.parseInt(bufferStringArray[z]);
			if(z != 10) {
				if(actualValue != 0 &&  bufferStringArray[z+1] != null) z++;
			}
		}
		return actualValue;
	}
}
