package exceptionhandling;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.*;

public class WriteData {

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.close();

	}
}
