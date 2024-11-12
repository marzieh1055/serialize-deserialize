package ir.freeland.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("name1", "4jdfj78giO", 1064635300));
		list.add(new User("name2", "1dfsfs", 80864550));
		list.add(new User("name3", "4sfsfsf", 143222200));
		list.add(new User("name4", "2dfs67", 5353535));

		
	        String filename = "savefile.txt";
	        
	        // Serialization 
	        try(FileOutputStream file = new FileOutputStream(filename);
		        ObjectOutputStream out = new ObjectOutputStream(file);)
	        {
	        	out.writeObject(list);
	            System.out.println("Object has been serialized");

	        }
	        
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }

	        List<User> object1;
	        // Deserialization
	        try(FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);)
	        {	            
	            // Method for deserialization of object
	            object1 = (List<User>)in.readObject();
	            System.out.println("Object has been deserialized");
	            System.out.println(object1.toString());
	        }
	        
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	        
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
	}
}