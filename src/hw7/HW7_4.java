package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//  請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
public class HW7_4 {
	public static void main(String[] arg) {
		File file = new File("C:/data");
		if(!file.exists()) {
			file.mkdir();
			System.out.print("Created a folder C:/data");
		}
		
		File pet = new File(file, "Object.ser");
		
		Action[] pets = new Action[7];
		 pets[0] = new Dog("Dog1");
		 pets[1] = new Cat("Cat1");
		 pets[2] = new Dog("Dog2");
		 pets[3] = new Cat("Cat2");
		 pets[4] = new Cat("Cat3");
		 pets[5] = new Cat("Cat4");
		 pets[6] = new Dog("Dog3");
		 
		 try {
		 FileOutputStream fos = new FileOutputStream(pet);
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 for(Object p : pets) {
			 oos.writeObject(p);
		 }
		 oos.close();
		 fos.close();
		 
		 }catch(IOException e){
			 e.printStackTrace();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 

		
	}
}
