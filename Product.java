
public class Product {
	ProductType type;
	DutyType dutyType;
	String name;
	float price;
	
	Product(String name,float price,ProductType type,DutyType dutyType){
		this.name = name;
		this.price = price;
		this.type = type;
		this.dutyType = dutyType;
	}
}
