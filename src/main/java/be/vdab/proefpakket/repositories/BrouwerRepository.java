package be.vdab.proefpakket.repositories;

import be.vdab.proefpakket.domain.Brouwer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// enkele imports
public interface BrouwerRepository extends JpaRepository<Brouwer, Long> {
    List<Brouwer> findByNaamStartingWithOrderByNaam(String beginNaam);
}
