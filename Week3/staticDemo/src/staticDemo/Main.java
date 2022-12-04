package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "";
		product.price = 10.0;
		
		manager.add(product);
		
		//inner class örneði
		DatabaseHelper.Connection.createConnection(); 
	}

}
