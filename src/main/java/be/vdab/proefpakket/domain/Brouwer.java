package be.vdab.proefpakket.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name="brouwers")
public class Brouwer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;
    @NotBlank
    private String naam;
    @Embedded
    private Adres adres;
    private long ondernemingsNr;

}
