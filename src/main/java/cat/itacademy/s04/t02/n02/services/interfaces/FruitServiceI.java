package cat.itacademy.s04.t02.n02.services.interfaces;

import cat.itacademy.s04.t02.n02.model.entity.Fruit;

import java.util.List;

public interface FruitServiceI {
    Fruit save(Fruit fruit);
    List<Fruit>findAll();
}
