package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class HW7_5 {

	public static void main(String[] args) {
		try {
			File file = new File("C:/data/Object.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(file.getName() + " contents:");
			
			try {
				while(true) {
					((Action)ois.readObject()).speak();
				}
			}catch(EOFException e) {
				System.out.println("End of file");
			}
			
			ois.close();
			fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
