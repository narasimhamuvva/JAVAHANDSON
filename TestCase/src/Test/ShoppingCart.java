package Test;

public class ShoppingCart {
	Product[ ] products;
	int i=0;
	public ShoppingCart()
	{
		products= new Product[10];
	}
	public void additem(Product product)
	{
		products[i++] = product;
	}
	public void empty()
	{
		
	}
	public Object getItemCount()
	{
		return i;
	}

}
