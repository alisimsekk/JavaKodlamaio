package interfaces;

public class CustomerManager {
	
	/* 1. se�enek
	ICustomerDal customerDal;
	
	public void add() {
		customerDal.add();
	}
	*/
	
	//	2. se�enek
	private ICustomerDal customerDal;
	CustomerManager(ICustomerDal customerDal){
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
	}
}
