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
import java.util.Scanner;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class HW7_3 {

	public static void main(String[] args) {
//		String sourcePath = "./src/hw7/Data.txt";
//		String outputPath = "C:/";
//		String sourcePath1 = "C:/CJA101_Workspace/Homework-38/src/hw7/類別項目區分.png";
//		String outputPath1 = "C:/";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose the type of file\nt: Text file / b: Binary file:  ");
		String set = sc.next();

		if(set.equals("t") || set.equals("T")) {
			System.out.println("Please Enter the Source file Path: ");
			String sourcePath = sc.next();
			System.out.println("Please Enter the output Path: ");
			String outputPath = sc.next();
			copyFile(sourcePath, outputPath);
		}else if(set.equals("b") || set.equals("B")) {
			System.out.println("Please Enter the Source file Path: ");
			String sourcePath = sc.next();
			System.out.println("Please Enter the output Path: ");
			String outputPath = sc.next();
			copyNonTextFile(sourcePath, outputPath);
		}else {
			System.out.println(set + "is not the type");
		}
		
	}

	public static void copyFile(String sourcePath, String outputPath) {
		File sourcefile = new File(sourcePath);
		
		File outputDir = new File(outputPath);
		
		if(!outputDir.exists())
			outputDir.mkdirs();

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {

			fr = new FileReader(sourcefile);
			br = new BufferedReader(fr);
			fw = new FileWriter(outputPath + sourcefile.getName());
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			String str;
			while ((str = br.readLine()) != null) {
				pw.println(str);
				pw.flush();

			}

			System.out.println("Copied " + sourcefile.getName() + " to " + outputPath);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void copyNonTextFile(String sourcePath, String outputPath) {
		File sourcefile = new File(sourcePath);
		File outputDir = new File(outputPath);
		
		if(!outputDir.exists())
			outputDir.mkdirs();
		
		File outputfile = new File(outputPath + sourcefile.getName());

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fis = new FileInputStream(sourcePath);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(outputfile);
			bos = new BufferedOutputStream(fos);
			int length = 0;
			byte[] b = new byte[4096];
			while ((length = bis.read(b)) != -1) {
				bos.write(b, 0, length);
				bos.flush();
			}

			System.out.println("Copied " + sourcefile.getName() + " to " + outputPath);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (fos != null) {
					fos.close();
				}
				if (bis != null) {
					bis.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

