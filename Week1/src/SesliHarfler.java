
public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kal�n sesli harf");
                break;
            default:
                System.out.println("�nce sesli harf");
        }
		
		
		/*  Alternatif ��z�m
		String harf = "s";
		String kalinSesliler = "a�ou";
		String inceSesliler = "ei��";
		
		String yeniHarf = harf.toLowerCase();
		
		if(kalinSesliler.contains(yeniHarf)) {
			System.out.println(harf + " kal�n seslidir.");
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
