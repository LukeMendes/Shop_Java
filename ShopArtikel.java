package Standard;

public class ShopArtikel {
	private int artikelnummer = 0;
	private String bezeichnung = "";
	private int bestand = 0;
	private double preis = 0;
	
	public ShopArtikel() {
		
	}
	
	public ShopArtikel(int artikelnummer, String bezeichnung, int bestand, double preis) {
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		this.bestand = bestand;
		this.preis = preis;
	}
	
	public void ausgabeAttribute() {
		System.out.println("Artikelnummer: " + this.artikelnummer);
		System.out.println("Bezeichnung: " + this.bezeichnung);
		System.out.println("Bestand: " + this.bestand);
		System.out.println("Preis: " + this.preis);
	}
	
	public void bestandVerringern(int anzahl) {
		if(anzahl > this.bestand) {
			System.out.println("Nicht mehr genügend Ware (Artikel: " + this.bezeichnung  + ")!");
		} else {
			this.bestand -= anzahl;
		}
	}
}
