package umlD.socar.product;

import java.util.List;
import java.util.Optional;

public interface carrepository {
    car save(car car);
    Optional<car> findById(Long id);
    Optional<List<car>> findByModel(String model);
    void deleteById(Long id);
}
