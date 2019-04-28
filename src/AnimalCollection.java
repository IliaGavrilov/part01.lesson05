import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class AnimalCollection {
    //private Set<Object> animalCollection = new HashSet<>();
    public Set<Object> animalCollection = new HashSet<>();

    void addAnimal(Object givenAnimal){
        if (equals(givenAnimal)){
            System.out.println("Объект: " + givenAnimal.toString() + " уже в списке!");
        }
        animalCollection.add(givenAnimal);
    }

    public Object animalSearch(String nameToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            //itr.next().animalName();
            Object x = itr.next();
            //String x = itr.next().toString();
            if (x.getAnimalName().equals(nameToSearch)) { //Почему нет доступа к name объекта из HashSet класса Animal?
                System.out.println("Животное найдено: ");
            }
            return null;
        }
        return null;
    }

    /* Переписанный метод equals() для выявления добавляемых дубликатов
     * для генерирования исключительной ситуации */
    @Override
    public boolean equals(Object o) {
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalCollection);
    }

    /* Метод toString() для вывода на экран списка животных */
    @Override
    public String toString() {
        return "AnimalCollection{" +
                "animalCollection=" + animalCollection +
                '}';
    }
}