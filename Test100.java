import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class Test100 {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:","Users","ict-24","OneDrive","Desktop","test.txt");
		String fileName = path.toString();
		File file = new File(fileName);
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			dos.writeUTF("hi, my name is david 이다빛 \n 하이");
			dos.writeInt(10);
			dis = new DataInputStream(new FileInputStream(file));
			String s = dis.readUTF();
			int a = dis.readInt();
			System.out.println(s);
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
