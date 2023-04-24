
package med.voll.api.repository;


import med.voll.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Long> {
}
