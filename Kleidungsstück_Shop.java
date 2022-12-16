package Standard;

public class Kleidungsstück_Shop extends ShopArtikel {
	private String farbe;
	private String jahreszeit;
	private boolean aenderungsmoeglichkeitsFlag;
	
	public Kleidungsstück_Shop() {
		super();
		this.farbe = "";
		this.jahreszeit = "";
		this.aenderungsmoeglichkeitsFlag = false;
	}
	
	public Kleidungsstück_Shop(String farbe, String jahreszeit, boolean aenderung, int artikelnummer, String bezeichnung, int bestand, double preis) {
		super(artikelnummer, bezeichnung, bestand, preis);
		this.farbe = farbe;
		this.jahreszeit = jahreszeit;
		this.aenderungsmoeglichkeitsFlag = aenderung;
	}
	
	public void ausgabeAttribute() {
		super.ausgabeAttribute();
		
		System.out.println("Farbe: " + this.farbe);
		System.out.println("Jahreszeit: " + this.jahreszeit);
		System.out.println("AendrungsmoeglichkeitsFlag: " + this.aenderungsmoeglichkeitsFlag);
	}
}
