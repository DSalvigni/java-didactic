package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObj {

	public static void main(String[] args) {
		Person[] people= {new Person("Gallucci","24"),new Person("fger","55"),new Person("Pikkia","88")};
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		/*
		Person a = new Person("Gallucci","24");
		Person b = new Person("Sballucci","44");
		System.out.println("Writing the file...");
		System.out.println(a.returnObj().toString());
		System.out.println(b.returnObj().toString());
		*/
		
		try(FileOutputStream fs = new FileOutputStream("people.txt")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			/*
			os.writeObject(a);
			os.writeObject(b);
			*/
			//I serialize the list
			System.out.println("Writing the file...");
			os.writeObject(people);
			
			//I serialize the array
			System.out.println("Writing the file as ArrayList...");
			os.writeObject(peopleList);
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
