import java.io.*;

public class Test {

	public static void main(String[] args){
				
		int [] arr = new int [10];
		int z = 0;
		String lol = "Hi";
		
		
		try {
		FileReader fr = new FileReader("C:\\Users\\noahg\\Desktop\\teeest.txt");
		} 
		catch (FileNotFoundException a) {
			System.out.println("DE DATEI GIBSCH NET");
			a.printStackTrace();
		} 
			  
		try {
			for (int i = 0; i < arr.length+1; i++) {
				arr[i] = i;
			}
		}
		catch (IndexOutOfBoundsException b) {
			System.out.println("\n"+"DEN INDEX GIBS BA DEM ARRAY NET");
			b.printStackTrace();
		}
		
		try {
			z = Integer.parseInt(lol);
		}
		catch (NumberFormatException c) {
			System.out.println("\n"+"DU KUSCH KOANE BUCHSTOBN IN AN INT SCHREIBN");
			c.printStackTrace();
		}
	}
}
