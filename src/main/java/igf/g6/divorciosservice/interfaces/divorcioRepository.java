package igf.g6.divorciosservice.interfaces;

import igf.g6.divorciosservice.models.Divorcio;
import org.springframework.data.repository.CrudRepository;

public interface divorcioRepository extends CrudRepository<Divorcio, Long> {
}
