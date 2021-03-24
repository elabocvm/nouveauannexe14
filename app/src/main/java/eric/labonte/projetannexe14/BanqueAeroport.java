package eric.labonte.projetannexe14;

import java.util.ArrayList;
import java.util.Hashtable;

public class BanqueAeroport {
    /* c'est un singleton */

    public static BanqueAeroport instance;
   // private ArrayList<Aeroport> liste;
    private Hashtable<String, Aeroport> liste;
    public static BanqueAeroport getInstance(){
        if ( instance == null)
        {
            instance = new BanqueAeroport();

        }

        return instance;
    }

    private BanqueAeroport ()
    {
        liste = new Hashtable<String, Aeroport>();
        liste.put( "Atlanta", new Aeroport ( "Hartsfield-Jackson", "Atlanta","ATL", 110000300   ));
        liste.put("Beijing", new Aeroport("Beijing Capital", "Beijing", "PEK",100011300));
        liste.put("Los Angeles",new Aeroport("Los Angeles", "Los Angeles", "LAX",88200000));
        liste.put("Dubai", new Aeroport("Dubai", "Dubai", "DXB",86386000));
        liste.put("Tokyo",new Aeroport("Tokyo Haneda", "Tokyo", "HND",85505000));
        liste.put("Chicago", new Aeroport("O'Hare", "Chicago", "ORD",84372000));
        liste.put("Londres",new Aeroport("Heathrow", "Londres", "LHR",80388000));
        liste.put("Dallas", new Aeroport("Dallas/Fort Worth International Airport", 	"Dallas", "DFW",	75066956));
        liste.put("Guangzhou" , new Aeroport("Guangzhou Baiyun",	"Guangzhou" ,"CAN",	73378475));
        liste.put("Amsterdam", new Aeroport ( "Schiphol", "Amsterdam","AMS",	71706999));


        for( int i = 0; i< 1000000; i++)
            liste.put("ville"+i, new Aeroport(""+i, "ville"+i, "a"+i,900000));

    }

    public Hashtable<String, Aeroport> getListe() {
        return liste;
    }

    public ArrayList<String> retournerVilles(){
        ArrayList<String> v = new ArrayList<String>();

            v.addAll(liste.keySet());
        return v;
    }

    public int retournerAchalandage ( String ville )
    {
        return liste.get(ville).getPassagers();
    }
}
