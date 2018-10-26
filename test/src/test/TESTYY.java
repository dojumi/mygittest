package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;

import java.io.OutputStreamWriter;

public class TESTYY {

	public static void main(String[] args) {
		System.out.println("----------------");
	/*	File file = new File("listId.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			BufferedWriter bufWriter = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
			bufWriter.write("7654321");
			bufWriter.newLine();
			bufWriter.close();
		} catch (Exception e) {
			e.printStackTrace();

		}*/
		
		double a=-2.55557;
		int t=(int)a;
		System.out.println("------------t---:"+t);
	}

}
