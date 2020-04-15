class ProductDiscount{

	public static void main(String[] args){
	
	double price,discount,countdis,amountafterdiscount;
	
	price =300;
	discount=12; //means 12%
	
	System.out.println("Price "+price);
	System.out.println("Discount "+discount);
	
	countdis=100-12;
	
	amountafterdiscount=(countdis*300)/100;
	
	System.out.println("Amount After Discount "+amountafterdiscount);
	}
}