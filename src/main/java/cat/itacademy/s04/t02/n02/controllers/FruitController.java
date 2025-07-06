package cat.itacademy.s04.t02.n02.controllers;

import cat.itacademy.s04.t02.n02.model.entity.Fruit;
import cat.itacademy.s04.t02.n02.services.FruitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/fruits")
public class FruitController {

    private final FruitService fruitServices;

    public FruitController(FruitService fruitServices) {
        this.fruitServices = fruitServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruit> create(@RequestBody Fruit fruit){
        return ResponseEntity.ok(fruitServices.save(fruit));
    }
    @PutMapping("/update")
    public ResponseEntity<Fruit> update(@RequestBody Fruit fruit){
        return ResponseEntity.ok(fruitServices.update(fruit));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAll(){
        return ResponseEntity.ok(fruitServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable Long id){
        return ResponseEntity.ok(fruitServices.findById(id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void>deleteById(@PathVariable Long id){
        fruitServices.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
