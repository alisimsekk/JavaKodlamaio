package interfaces;

public class Main {

	public static void main(String[] args) {
		/*	1. se�enek
	
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new MySqlCustomerDal();
		customerManager.add();
		*/
		
		//	2. se�enek
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		
	}

}
