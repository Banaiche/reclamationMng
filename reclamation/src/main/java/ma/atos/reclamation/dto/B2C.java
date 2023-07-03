package ma.atos.reclamation.dto;

public class B2C extends Client{

    private String cin;
    private String nomComplet;

    public B2C(String reference, String adresse, String cin, String nomComplet) {
        super(reference, adresse);
        this.cin = cin;
        this.nomComplet = nomComplet;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
}
