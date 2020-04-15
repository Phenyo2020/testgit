class ProductDiscount{

	public static void main(String[] args){
	
	double price,discount,countdis,amountafterdiscount;
	
	price =400;
	discount=10; //means 10%
	
	System.out.println("Price "+price);
	System.out.println("Discount "+discount);
	
	countdis=100-12;
	
	amountafterdiscount=(countdis*400)/100;
	
	System.out.println("Amount After Discount "+amountafterdiscount);
	}
}