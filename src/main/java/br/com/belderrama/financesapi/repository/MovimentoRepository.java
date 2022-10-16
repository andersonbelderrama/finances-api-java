package br.com.belderrama.financesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.belderrama.financesapi.model.Movimento;

public interface MovimentoRepository extends JpaRepository<Movimento, Integer> {
    


}
