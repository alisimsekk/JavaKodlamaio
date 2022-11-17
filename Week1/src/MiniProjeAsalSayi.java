
public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -5;
		int count = 0;
		
		if(number<1) {
			System.out.println(number + " geçersiz sayý");
			return;
		}
		
		for(int i = 1; i<=number; i++) {
			if(number % i ==0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(number + " asal sayýdýr.");
		}
		else {
			System.out.println(number + " asal sayý deðildir.");
		}
		
	}

}
