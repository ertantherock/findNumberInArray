package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,7,13,45,23};
		
		int aranacak = 44;
		boolean varMi = false;
		
		for (int number : numbers) {
			if (number == aranacak) {
				varMi = true;
			} 
			
			
		}
		
		if (varMi) {
			System.out.println(aranacak + " sayısı listede bulunmaktadır.");
		} else {
			System.out.println(aranacak + " sayısı listede bulunmaMAktadır.");
		}
	}

}
