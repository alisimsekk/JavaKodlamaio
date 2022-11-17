
public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 266;
		int sayi2 = 25;
		int sayi3 = 26;
		
		int enBuyuk = sayi1;
		
		if (sayi2 > enBuyuk) {
			enBuyuk = sayi2;
		}
		
		if (sayi3 > enBuyuk) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);
	}

}
