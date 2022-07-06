public class UnsysnchronizedBuffer implements Buffer {
	private int buffer = -1;
	private int j = 0;
	private int z = 0;
	private double[] bufferDouble = new double[10];
	private String[] bufferString = new String[10];

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
	public void putBufferDouble(double value) throws InterruptedException {
		System.out.printf("Escrita valor putBufferDouble: \t\t%,.2f", value);
		int i = (int) value;
		bufferDouble[i-1] = value;
	}

	@Override
	public double getBufferDouble() throws InterruptedException {
		double readValue = bufferDouble[j];
		System.out.printf("Leitura valor do getBufferDouble: \t\t%,.2f", readValue);
		if(j != 10) {
			if(readValue != 0 && bufferDouble[j+1] != 0) j++;
		}
		return readValue;
	}

	@Override
	public void putBufferString(int indice) throws InterruptedException {
		System.out.printf("Escrita valor do putBufferString: \t\t%d", indice);
		String value = String.valueOf(indice);
		bufferString[indice-1] = value;
	}

	@Override
	public int getBufferString() throws InterruptedException {
		int actualValue;
		System.out.printf("Leitura valor do getBufferString: \t\t%s", bufferString[z]);
		if(bufferString[z] == null) actualValue = 0;
		else {
			actualValue = Integer.parseInt(bufferString[z]);
			if(z != 10) {
				if(actualValue != 0 &&  bufferString[z+1] != null) z++;
			}
		}
		return actualValue;
	}

	@Override
	public void putBufferString(String valorString) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	
}
