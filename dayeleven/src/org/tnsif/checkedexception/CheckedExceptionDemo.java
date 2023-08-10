package org.tnsif.checkedexception;
//program to demonstrate on checked exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f = new FileInputStream("C:\\Users\\Sanika\\OneDrive\\Desktop\\ALL");
		System.out.println("File has Found");
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist: "+e);
		}
	}

}
