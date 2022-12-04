package interfaces;

public class CustomerManager {
	
	/* 1. seçenek
	ICustomerDal customerDal;
	
	public void add() {
		customerDal.add();
	}
	*/
	
	//	2. seçenek
	private ICustomerDal customerDal;
	CustomerManager(ICustomerDal customerDal){
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
	}
}
