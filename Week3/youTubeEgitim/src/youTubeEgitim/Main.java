package youTubeEgitim;

import youTubeEgitim.business.CustomerManager;
import youTubeEgitim.business.MilitaryCreditManager;
import youTubeEgitim.business.TeacherCreditManager;
import youTubeEgitim.entities.Company;
import youTubeEgitim.entities.Customer;
import youTubeEgitim.entities.Person;

public class Main {

	public static void main(String[] args) {
		/*
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Ankara");
				
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.taxNumber = "100000";
		company.setCompanyName("Arçelik");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager()
		
		Person person = new Person();
		person.setFirstName("Ali");
		person.setNationalIdentity("20000");
		person.setId(100);
		*/
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}

}
