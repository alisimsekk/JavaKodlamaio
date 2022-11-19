package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca(){
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
			mesajVer(aranacak + " listede vardýr");
		}
		else {
			mesajVer(aranacak + " listede yoktur");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
