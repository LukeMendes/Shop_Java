package Standard;

public class Elektroger�t_Shop extends ShopArtikel {
	private int garantiezeit;
	private boolean angebotDesMonatsFlag;
	
	public Elektroger�t_Shop() {
		super();
		this.garantiezeit = 24;
		this.angebotDesMonatsFlag = false;
	}
	
	public Elektroger�t_Shop(int garantie, boolean angebot, int artikelnummer, String bezeichnung, int bestand, double preis) {
		super(artikelnummer, bezeichnung, bestand, preis);
		this.garantiezeit = garantie;
		this.angebotDesMonatsFlag = angebot;
	}
	
	public void ausgabeAttribute() {
		super.ausgabeAttribute();
		
		System.out.println("Garantiezeit: " + this.garantiezeit);
		System.out.println("AngebotDesMonatsFlag: " + this.angebotDesMonatsFlag);
	}
}
