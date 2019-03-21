import java.util.List;

public class ReceiptGenerator {
	
	private List<Product> products = null; 
	Receipt receipt;
	Tax taxCalulator = null;
	
	ReceiptGenerator(List<Product> products){
		this.products = products;
		receipt = new Receipt();
		taxCalulator = new Tax();
	}
	
	public Receipt getReceipt(){
		
		float taxPrice;
		float itemPrice;
		
		for(Product curProduct : products){
			taxPrice = taxCalulator.getTaxPrice(curProduct);
			itemPrice = curProduct.price + taxPrice;
			receipt.addProduct(curProduct.name, itemPrice, taxPrice);
		}
		
		return receipt;
	}
}
