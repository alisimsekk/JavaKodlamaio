package youTubeEgitim.business;

public abstract class BaseCreditManager implements IcreditManager {
	@Override
	//kredi t�r�ne g�re hesaplama de�i�iyor.
	public abstract void calculate(); 

	@Override
	
	//kredi t�r�ne g�re save metodu de�i�miyor. ayn� i�lemi yapuy�r.
	/*
	public void save() {
		System.out.println("Kaydedildi");
	}
	*/
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}
