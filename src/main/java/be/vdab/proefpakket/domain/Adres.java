package be.vdab.proefpakket.domain;


import org.hibernate.validator.constraints.Range;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

// enkele imports
@Embeddable
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotBlank
    private String straat;
    @NotBlank
    private String huisNr;
    @NotNull
    @Range(min = 1000, max = 9999)
    private int postcode;
    @NotBlank
    private String gemeente;
// Je maakt getters voor alle variabelen (behalve serialVersionUID)

    public String getStraat() {
        return straat;
    }

    public String getHuisNr() {
        return huisNr;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getGemeente() {
        return gemeente;
    }
}
