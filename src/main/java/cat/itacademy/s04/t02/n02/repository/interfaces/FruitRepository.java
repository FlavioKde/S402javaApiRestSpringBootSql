package cat.itacademy.s04.t02.n02.repository.interfaces;

import cat.itacademy.s04.t02.n02.model.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FruitRepository extends JpaRepository<Fruit, Long>{

        Optional<Fruit> findByName(String name);
}


