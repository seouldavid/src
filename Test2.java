import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		try {
			divide(a,b);
		} catch (IOException e) {
			System.out.println("ioexception");
//			e.printStackTrace();
}
}

	public static void divide(int a, int b) throws IOException  {
		throw new IOException();
	
}
}