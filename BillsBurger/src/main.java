
public class main {
	public static void main(String [] args) {
		Hamburger hamburger1 = new Hamburger("cheeseBurger" , "beef" , 3.35 , "White");
		double price = hamburger1.itemizeHamburger();
		hamburger1.addHamburgerAddition1("tomato", 0.40);
		hamburger1.addHamburgerAddition2("lettucce", 0.38);
		hamburger1.addHamburgerAddition3("onion", 0.23);
		hamburger1.addHamburgerAddition4("extra cheese",0.68 );
		System.out.println("total burger prize is " + hamburger1.itemizeHamburger() );
		
		HealthyBurger healthy = new HealthyBurger("bacon",5.57);
		healthy.addHealthyAddition1("egg",3.48);
		healthy.addHamburgerAddition2("gabbage", 2.26);
		System.out.println("Total price for healthy Burger is" + healthy.itemizeHamburger());
	}
	
}
