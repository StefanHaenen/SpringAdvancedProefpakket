package be.vdab.proefpakket.domain;


import org.hibernate.validator.constraints.Range;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

// enkele imports
@Embeddable
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    private String straat;
    private String huisNr;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "gemeenteid")
    private Gemeente gemeente;
// Je maakt getters voor alle variabelen (behalve serialVersionUID)

    public String getStraat() {
        return straat;
    }

    public String getHuisNr() {
        return huisNr;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }
}
