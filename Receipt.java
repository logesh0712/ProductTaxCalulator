import java.util.ArrayList;
import java.util.List;

public class Receipt {
	public List<ProdcutPricePair> items;
	public float totalCost;
	public float totalSalesTax;
	
	Receipt(){
		items = new ArrayList<ProdcutPricePair>();
		totalCost = 0;
		totalSalesTax = 0;
	}
	
	public void addProduct(String name,float price,float taxPrice){
		
		ProdcutPricePair pair = new ProdcutPricePair(name,price);
		items.add(pair);
		totalCost += price;
		totalSalesTax += taxPrice;
	}
	
}

