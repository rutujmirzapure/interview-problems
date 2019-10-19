package hashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class PhoneDirectory {
	
	private Hashtable myDirectory = new Hashtable();
	
	public static void main(String args[]) {
		
		PhoneDirectory directory = new PhoneDirectory();
		
		directory.addEntry("Shreyas" , "900112121");
		directory.addEntry("Sonu" , "8212121212");
		directory.addEntry("Shri" , "7212221212");
		directory.addEntry("shree" , "8888888888");
		directory.addEntry("Shreyas", "900112121");
		
		directory.printDirectory();
		
		}
	
	public void addEntry(String name , String phoneNumber) {
	  myDirectory.put(name , phoneNumber);
	}
	
	public void printDirectory() {
		Set keys = myDirectory.keySet();
		
		Iterator iterator = keys.iterator();
		while(iterator.hasNext()) {
			
			String name = iterator.next().toString();
			String phoneNumber = myDirectory.get(name).toString();
			
			System.out.println("name = " + name + " || " + "PhoneNo = " + myDirectory.get(name) );
		}
	}
	
		}
	
	
