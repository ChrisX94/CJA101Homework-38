package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class HW7_3 {

	public static void main(String[] args) {
		String sourcePath = "./src/hw7/Data.txt";
		String outputPath = "C:/";
		copyFile(sourcePath, outputPath);

		String sourcePath1 = "./src/hw7/類別項目區分.png";
		String outputPath1 = "C:/";
		
		copyNonTextFile(sourcePath1, outputPath1);


	}

	public static void copyFile(String sourcePath, String outputPath) {
		File sourcefile = new File(sourcePath);

		try {

			FileReader fr = new FileReader(sourcefile);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(outputPath + sourcefile.getName());
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			String str;
			while ((str = br.readLine()) != null) {
				pw.println(str);
				fw.flush();
				bw.flush();
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("Copied " + sourcefile.getName() + " to " + outputPath);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void copyNonTextFile(String sourcePath, String outputPath) {
		try {
			File sourcefile = new File(sourcePath);
			File outputfile = new File(outputPath + sourcefile.getName());
			FileInputStream fis = new FileInputStream(sourcePath);
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream(outputfile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int length = 0;
			byte[] b = new byte[4096];
			while ((length = bis.read(b)) != -1) {
				bos.write(b, 0, length);
				bos.flush();
			}

			bos.close();
			fos.close();
			bis.close();
			fis.close();

			System.out.println("Copied " + sourcefile.getName() + " to " + outputPath);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
