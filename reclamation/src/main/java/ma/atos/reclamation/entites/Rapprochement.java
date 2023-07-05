package ma.atos.reclamation.entites;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Rapprochement {


    private String reference;
    private Caisse caisse;
    private LocalDateTime date;
    private boolean ecart;

    private BigDecimal montantEcart;

    public Rapprochement(String reference, Caisse caisse, LocalDateTime date, boolean ecart, BigDecimal montantEcart) {
        this.reference = reference;
        this.caisse = caisse;
        this.date = date;
        this.ecart = ecart;
        this.montantEcart = montantEcart;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public boolean isEcart() {
        return ecart;
    }


    public void setEcart(boolean ecart) {
        this.ecart = ecart;
    }

    public BigDecimal getMontantEcart() {
        return montantEcart;
    }

    public void setMontantEcart(BigDecimal montantEcart) {
        this.montantEcart = montantEcart;
    }
}
