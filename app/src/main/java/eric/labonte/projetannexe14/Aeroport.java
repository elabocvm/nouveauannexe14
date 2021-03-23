package eric.labonte.projetannexe14;

public class Aeroport {

    private String nom;
    private String ville;
    private String code;
    private int passagers;

    public Aeroport(String nom, String ville, String code, int passagers) {
        this.nom = nom;
        this.ville = ville;
        this.code = code;
        this.passagers = passagers;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getCode() {
        return code;
    }

    public int getPassagers() {
        return passagers;
    }
}
