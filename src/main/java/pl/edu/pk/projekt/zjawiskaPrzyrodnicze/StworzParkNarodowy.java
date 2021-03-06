package pl.edu.pk.projekt.zjawiskaPrzyrodnicze;

import java.io.IOException;

public class StworzParkNarodowy {
	ParkNarodowyInterface builder;
	
	public void stworzParkNarodowy(ParkNarodowyInterface builder){
		this.builder = builder;
	}
	
	public ParkNarodowy getParkNarodowy() throws IOException{
		builder.setNazwa();
		builder.setFlora();
		builder.setFauna();
		builder.setSlonceDeszcz();
		builder.setOpis();
		builder.setMiejsce();
		return builder.getParkNarodowy();
	}
	
	public void print (ParkNarodowy park){
		System.out.println("Nazwa: " + park.getNazwa());
		System.out.println("Flora: " + park.getFlora());
		System.out.println("Fauna: " + park.getFauna());
		System.out.println("Czy zalezy od pogody: " + park.getSlonceDeszcz());
		System.out.println("Fajne miejsce do zobaczenia: " + park.getMiejsce());
		System.out.println("Opis miejsca: " + park.getOpis());
	}
}
