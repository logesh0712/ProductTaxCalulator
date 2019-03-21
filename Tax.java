
public class Tax {
	private final float IMPORT_DUTY_TAX_RATE = 5;
	private final float BASIC_DUTY_TAX_RATE = 10;
	
	private boolean isBasicTaxApplicable(Product product){
		
		if(product.type == ProductType.BOOKS || product.type == ProductType.FOOD || product.type == ProductType.MEDICAL){
			return false;
		}
		
		return true;
	}
	
	private float getBasicTaxPrice(float price){
		return ((price*BASIC_DUTY_TAX_RATE)/100);
	}

	
	private float getImportTaxPrice(float price){
		return ((price*IMPORT_DUTY_TAX_RATE)/100);
	}
	
	public float getTaxPrice(Product product){
		
		float basicTaxPrice = 0;
		if(isBasicTaxApplicable(product)){
			basicTaxPrice = getBasicTaxPrice(product.price);
		}
		
		float importTaxPrice =0;
		if(product.dutyType == DutyType.IMPORTED){
			importTaxPrice = getImportTaxPrice(product.price);
		}
		
		return basicTaxPrice + importTaxPrice;
	}
}
