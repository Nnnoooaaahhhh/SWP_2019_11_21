
public class Test2 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		
		
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
		}
		catch (IndexOutOfBoundsException b) {
			System.out.println("DEN INDEX GIBS BA DEM ARRAY NET DU KEK");
			b.printStackTrace();
		}

	}

}
