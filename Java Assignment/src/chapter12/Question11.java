package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) throws java.lang.Exception {
		if (args.length != 3) {
			System.out.println("Usage: Arguments to be entered: sourceFile targetFile oldStr");
			System.exit(1);
		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		// Check if target file exists
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(3);
		}
		try (
				// Create input and output files
				Scanner input = new Scanner(sourceFile); PrintWriter output = new PrintWriter(targetFile);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2],"");
				output.println(s2);
			}
			System.out.println("Output file is ready with the change");
		}
		catch (Exception e){
			System.out.println("Exception occurred"+e.getMessage());
		}
	}
}
