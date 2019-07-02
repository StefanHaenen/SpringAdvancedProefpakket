package be.vdab.proefpakket.services;

import be.vdab.proefpakket.domain.Brouwer;
import be.vdab.proefpakket.repositories.BrouwerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// enkele imports
@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
class DefaultBrouwerService implements BrouwerService {
    private final BrouwerRepository brouwerRepository;
    DefaultBrouwerService(BrouwerRepository brouwerRepository) {
        this.brouwerRepository = brouwerRepository;
    }
    @Override
    public List<Brouwer> findByBeginNaam(String beginNaam) {
        return brouwerRepository.findByNaamStartingWithOrderByNaam(beginNaam);
    }
}