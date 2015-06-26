package pl.edu.pk.projekt.zjawiskaPrzyrodnicze;

import java.io.IOException;

public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        StworzParkNarodowy stworzPark = new StworzParkNarodowy();
        ParkNarodowy park;
        stworzPark.stworzParkNarodowy(new TatrzanskiParkNarodowy());
        park = stworzPark.getParkNarodowy();
        stworzPark.print(park);
        
        
    }
}
