package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObj {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Reading the file...");
		
		try(
				FileInputStream fi = new FileInputStream("people.txt");
				ObjectInputStream os = new ObjectInputStream(fi);)
				{
					
					
					/*
					Person p1 = (Person)os.readObject();
					Person p2 = (Person)os.readObject();
					
					System.out.println(p1.returnObj());
					System.out.println(p2.returnObj());
					*/
					
					//LIst iteration
					Person[] people=(Person[])os.readObject();
					for(Person person: people) {
						System.out.println(person.returnObj());
					}
					
					//Arraylist iteration
					@SuppressWarnings("unchecked")
					ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
					for(Person person: peopleList) {
						System.out.println(person.returnObj());
					}
					
					
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
