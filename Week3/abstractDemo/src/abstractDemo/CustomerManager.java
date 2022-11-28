package abstractDemo;

public class CustomerManager {
	//strateji patern
	
	BaseDatabaseManager databaseManager; 
	
	public void getCustomers() {
		databaseManager.getData();
	} 

}
