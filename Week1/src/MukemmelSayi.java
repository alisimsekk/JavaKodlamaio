
public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 6;
		int total = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total+=i;
			}
		}
		
		if(total == number) {
			System.out.println(number + " m�kemmel say�d�r");
		}
		else {
			System.out.println(number + " m�kemmel say� de�ildir");
		}
		
	}

}
