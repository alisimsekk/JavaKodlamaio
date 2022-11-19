package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) { //... ya variable arguments denir. methoda s�n�rs�z say� g�nderebiliriz. say�lar bir int array gibi �al���r. Asl�nda bu sayilar dedi�imiz �ey bir dizidir
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam +=sayi;
		}
		return toplam;		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
