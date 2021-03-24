package eric.labonte.projetannexe14;

import java.util.ArrayList;

public class BanqueAeroport {
    /* c'est un singleton */

    public static BanqueAeroport instance;
    private ArrayList<Aeroport> liste;

    public static BanqueAeroport getInstance(){
        if ( instance == null)
        {
            instance = new BanqueAeroport();

        }

        return instance;
    }

    private BanqueAeroport ()
    {
        liste = new ArrayList<Aeroport>();
        liste.add( new Aeroport ( "Hartsfield-Jackson", "Atlanta","ATL", 110000300   ));
        liste.add(new Aeroport("Beijing Capital", "Beijing", "PEK",100011300));
        liste.add(new Aeroport("Los Angeles", "Los Angeles", "LAX",88200000));
        liste.add(new Aeroport("Dubai", "Dubai", "DXB",86386000));
        liste.add(new Aeroport("Tokyo Haneda", "Tokyo", "HND",85505000));
        liste.add(new Aeroport("O'Hare", "Chicago", "ORD",84372000));
        liste.add(new Aeroport("Heathrow", "Londres", "LHR",80388000));
        liste.add(new Aeroport("Dallas/Fort Worth International Airport", 	"Dallas-Fort Worth", "DFW",	75066956));
        liste.add( new Aeroport("Guangzhou Baiyun",	"Guangzhou" ,"CAN",	73378475));
        liste.add(new Aeroport ( "Schiphol", "Amsterdam","AMS",	71706999));

        for( int i = 0; i< 1000000; i++)
            liste.add(new Aeroport(""+i, "ville"+i, "a"+i,900000));

    }

    public ArrayList<Aeroport> getListe() {
        return liste;
    }

    public ArrayList<String> retournerVilles(){
        ArrayList<String> v = new ArrayList<String>();
        for ( Aeroport a : liste)
            v.add(a.getVille());
        return v;
    }

    public int retournerAchalandage ( String ville )
    {
        for ( int i = 0; i< liste.size(); i++)
        {
            if ( liste.get(i).getVille().equals(ville))
                return liste.get(i).getPassagers();
        }
        return 0;
    }
}
