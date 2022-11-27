package youTubeEgitim.business;

public abstract class BaseCreditManager implements IcreditManager {
	@Override
	//kredi türüne göre hesaplama deðiþiyor.
	public abstract void calculate(); 

	@Override
	
	//kredi türüne göre save metodu deðiþmiyor. ayný iþlemi yapuyýr.
	/*
	public void save() {
		System.out.println("Kaydedildi");
	}
	*/
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}
