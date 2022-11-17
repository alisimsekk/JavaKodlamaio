
public class SayiBulma {

	public static void main(String[] args) {
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 7;
		boolean varMi = false;
		for(int s : sayilar) {
			if(aranacak == s) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println(aranacak + " listede vardýr");
		}
		else {
			System.out.println(aranacak + " listede yoktur");
		}
		
	}

}
