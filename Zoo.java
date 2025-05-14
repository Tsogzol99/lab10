import java.util.List;
import java.util.ArrayList;

public class Zoo<T extends Animal> {
    private List<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
        source.clear();
    }

    public List<T> getAnimals() {
        return animals;
    }
}