
public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalýn sesli harf");
                break;
            default:
                System.out.println("Ýnce sesli harf");
        }
		
		
		/*  Alternatif çözüm
		String harf = "s";
		String kalinSesliler = "aýou";
		String inceSesliler = "eiöü";
		
		String yeniHarf = harf.toLowerCase();
		
		if(kalinSesliler.contains(yeniHarf)) {
			System.out.println(harf + " kalýn seslidir.");
		}
		else if (inceSesliler.contains(yeniHarf)) {
			System.out.println(harf + " ince seslidir.");
		}
		else {
			System.out.println(harf + " sessiz harftir.");
		}
		*/
		
		
		
		
		
	}

}
