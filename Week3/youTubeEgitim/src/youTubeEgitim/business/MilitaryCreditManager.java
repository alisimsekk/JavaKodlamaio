package youTubeEgitim.business;

public class MilitaryCreditManager implements IcreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandý");
		
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
		
	}

}
