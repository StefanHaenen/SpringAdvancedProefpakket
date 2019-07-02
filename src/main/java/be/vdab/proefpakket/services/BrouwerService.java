package be.vdab.proefpakket.services;

import be.vdab.proefpakket.domain.Brouwer;

import java.util.List;

// enkele imports
public interface BrouwerService {
    List<Brouwer> findByBeginNaam(String beginNaam);
}