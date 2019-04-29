import java.util.*;

public class AnimalCollection {
    public Set<Animal> animalCollection = new HashSet<>();

    /* Метод добавления животного в общий список  */
    void addAnimal(Animal givenAnimal){
        if (equals(givenAnimal)){
            System.out.println("Объект: " + givenAnimal.toString() + " уже в списке!");
        }
        animalCollection.add(givenAnimal);
    }

    /* Поиск животного по его кличке */
    public void animalSearch(String nameToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Animal x = (Animal)itr.next();
            //System.out.println("Имя животного: "+x.getAnimalName());
            if (x.getAnimalName() == nameToSearch) {
                System.out.println("Животное найдено: " + x.toString());
            }
            x = null;
        }
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