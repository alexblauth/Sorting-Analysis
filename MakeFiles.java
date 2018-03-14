import java.util.*;
import java.io.*;

public class MakeFiles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many items would you like?");
		int numOfInts = in.nextInt();
		System.out.println("A-csending, D-Scending, or R-andom");
		String listType = in.next();
		System.out.println("name this file");
		String fileName = in.next();
		fileName = fileName + ".txt";
		
		File theFile = new File(fileName);
		
		try{
			PrintWriter output = new PrintWriter(theFile);
			
			if(listType.equalsIgnoreCase("a")) {
				for(int c = 0; c < numOfInts; c++) {
					output.println(c);
				}
			}
			else if(listType.equalsIgnoreCase("r")) {
				for(int c = 0; c < numOfInts; c++) {
					int random = (int)(Math.random() * numOfInts);
					output.println(random);
				}
			}
			else if(listType.equalsIgnoreCase("d")) {
				for(int c = numOfInts; c > 0; c--) {
					output.println(c);
				}
			}
			
			
			output.close();
		} 
		catch(Exception e){
			System.out.println("Error");
		}
		
		
		in.close();

	}

}
