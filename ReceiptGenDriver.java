import java.util.ArrayList;
import java.util.List;

public class ReceiptGenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("Book",(float)12.49,ProductType.FOOD,DutyType.LOCAL));
		products.add(new Product("musicCd",(float)14.99,ProductType.ELECTRONICS,DutyType.LOCAL));
		products.add(new Product("choclate",(float)0.85,ProductType.FOOD,DutyType.LOCAL));
		
		
		ReceiptGenerator receiptGen = new ReceiptGenerator(products);
		
		Receipt receipt = receiptGen.getReceipt();
		
		if(receipt != null){
			for(ProdcutPricePair curPair : receipt.items){
				System.out.println(curPair.name + " : " + curPair.price);
			}
			
			System.out.println("sales tax : " + receipt.totalSalesTax);
			System.out.println("Total : " + receipt.totalCost);
		}
	}

}
