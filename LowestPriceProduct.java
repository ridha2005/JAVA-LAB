package ridha;
class product{
	int pcode;
	String pname;
	double price;
	product (int c,String n,double p){
		pcode = c;
		pname = n;
		price = p;
	}
	void display() {
		System.out.println("product code :" +pcode);
		System.out.println("product name :" +pname);
		System.out.println("price        :" +price);
		System.out.println("------------------------" );
	}
}

public class LowestPriceProduct {

	public static void main(String[] args) {
		product p1  = new product(101,"laptop",55000);
		product p2  = new product(102,"mobile",18000);
		product p3  = new product(103,"printer",12000);
		product lowest=p1;
		if(p2.price < lowest.price) {
			lowest= p2;
		}
		if(p3.price < lowest.price) {
			lowest=p3;
		}
		System.out.println("Product with Lowest Price:");
		System.out.println("==========================");
		lowest.display();
		// TODO Auto-generated method stub

	}

}
