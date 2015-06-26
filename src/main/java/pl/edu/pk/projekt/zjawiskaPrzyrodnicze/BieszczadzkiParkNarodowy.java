package pl.edu.pk.projekt.zjawiskaPrzyrodnicze;

import java.io.IOException;

public class BieszczadzkiParkNarodowy {
	
	private ParkNarodowy park;
	private ReadFile file;
	private String text;
	public BieszczadzkiParkNarodowy(){
		park = new ParkNarodowy();
	}
	
	public void setNazwa(){
		park.setNazwa("Bieszczadzki Park Narodowy");
	}
	
	public void setFlora(){ 
		park.setFlora("Konopie Indyjskie");
	}
	
	public void setFauna(){
		park.setFauna("Niedzwiedz Brunatny");
	}

	public void setSlonceDeszcz() {
		park.setSlonceDeszcz(true);
	}

	public void setOpis() throws IOException {
		file = new ReadFile();
		text = file.readFile("src/main/resources/bieszczadzki.txt");
		park.setOpis(text);
	}
	
	public void setMiejsce(){
		park.setMiejsce("Jaskinia z nietoperzami i borsukiem");
	}
	
	public ParkNarodowy getParkNarodowy() {
		return park;
	}


}
