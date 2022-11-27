package youTubeEgitim.business;

import youTubeEgitim.entities.Customer;

public class CustomerManager {	
	
	private Customer customer;
	private IcreditManager icreditManager;
	
	public CustomerManager(Customer customer,IcreditManager icreditManager ) {
		this.customer = customer;
		this.icreditManager = icreditManager;
	}
	
	public void save () {
		System.out.println("Müþteri kaydedildi : ");
	}

	public void delete() {
		System.out.println("Müþteri silindi : ");
	}
	
	public void giveCredit() {
		icreditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
