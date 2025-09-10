package umlD.socar.product;

import java.util.*;

public class MemoryCarRepositoty implements carrepository{
    private final Map<Long,car> store = new HashMap<>();
    @Override
    public car save(car car) {
        store.put(car.getCarId(),car);
        return car;
    }

    @Override
    public Optional<car> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<List<car>> findByModel(String model) {
        List<car> cars =new ArrayList<>(store.values()).stream().filter(car-> car.getCarName().equals(model)).toList();
        return Optional.ofNullable(cars);
    }

    @Override
    public void deleteById(Long id) {
        store.remove(id);
    }
}
