package Standard;

public class TestShop {

	public static void main(String[] args) {
		Elektrogerät_Shop Panasonic = new Elektrogerät_Shop(12, true, 63828, "SmartTV", 100, 599.90);
		
		Kleidungsstück_Shop Nike = new Kleidungsstück_Shop("Schwarz", "Sommer", false, 74298, "Laufschuhe", 2000, 29.99);
		
		Panasonic.ausgabeAttribute();
		System.out.println();
		Panasonic.ausgabeAttribute();
		
		System.out.println();
		
		Nike.bestandVerringern(200);
		Nike.bestandVerringern(300);
		
		System.out.println();
		
		Nike.ausgabeAttribute();
		System.out.println();
		Nike.ausgabeAttribute();
	}
}