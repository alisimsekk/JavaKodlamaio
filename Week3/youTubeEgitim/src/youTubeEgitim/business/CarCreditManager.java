package youTubeEgitim.business;

public class CarCreditManager implements IcreditManager{

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandý");
		
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
		
	}
	
	

}
