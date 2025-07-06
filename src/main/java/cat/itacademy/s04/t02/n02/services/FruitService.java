package cat.itacademy.s04.t02.n02.services;

import cat.itacademy.s04.t02.n02.exception.exceptions.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n02.exception.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.exception.exceptions.InvalidFruitDataException;
import cat.itacademy.s04.t02.n02.model.entity.Fruit;
import cat.itacademy.s04.t02.n02.repository.interfaces.FruitRepository;
import cat.itacademy.s04.t02.n02.services.interfaces.FruitServiceI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService implements FruitServiceI {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }


    @Override
    public Fruit save(Fruit fruit){
        if (fruit.getName() == null || fruit.getName().trim().isEmpty()){
            throw new InvalidFruitDataException(fruit);
        } else if (fruitRepository.findByName(fruit.getName()).isPresent()) {
            throw new FruitAlreadyExistException(fruit.getName());
        }
        return fruitRepository.save(fruit);

    }

    public Fruit update(Fruit fruit){
        if (!fruitRepository.existsById(fruit.getId())){
            throw new FruitNotFoundException(fruit.getId());
        }
        return fruitRepository.save(fruit);
    }
    @Override
    public List<Fruit> findAll(){
        return fruitRepository.findAll();
    }
    public Fruit findById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public void deleteById(Long id){
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException(id);
        }
        fruitRepository.deleteById(id);

    }
}
