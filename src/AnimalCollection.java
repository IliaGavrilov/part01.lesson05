import java.util.*;

public class AnimalCollection {
    public Set<Animal> animalCollection = new HashSet<>();

    /* Метод добавления животного в общий список */
    public void addAnimal(Animal givenAnimal){
        if (equals(givenAnimal)){
            System.out.println("Объект: " + givenAnimal.toString() + " уже в списке!");
        }
        animalCollection.add(givenAnimal);
    }

    /* Поиск животного по его кличке */
    public Animal animalSearch(String nameToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Animal x = (Animal)itr.next();
            if (x.getAnimalName() == nameToSearch) {
                System.out.println("Животное найдено: " + x.toString());
                return x;
            }
            x = null;
        }
        return null;
    }

    /* Поиск животного по его id для изменения данных животного */
    public Animal animalSearch(int tempIdToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Animal x = (Animal)itr.next();
            if (x.getId() == tempIdToSearch) {
                System.out.println("Животное найдено: " + x.toString());
                return x;
            }
            x = null;
        }
        System.out.println("Животное c id: "+ tempIdToSearch + " не найдено ");
        return null;
    }

    /* Метод для изменения данных животного по его идентификатору */
    public void changeAnimalRecord(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите Id животного: ");
        int givenId = Integer.parseInt(reader.nextLine());
        Animal x = animalSearch(givenId);
        System.out.print("Введите новое имя: ");
        String givenName = reader.nextLine();
        System.out.print("Введите новый вес: ");
        Double givenWeight = Double.parseDouble(reader.nextLine());

        System.out.print("Укажите имя нового хозяина: ");
        String givenOwnerName = reader.nextLine();
        System.out.print("Укажите возвраст нового хозяина: ");
        int givenAge = Integer.parseInt(reader.nextLine());
        System.out.print("Укажите пол нового хозяина: ");
        String givenOwnerSex = reader.nextLine();

        Person tempOwner = new Person(givenOwnerName, givenAge, givenOwnerSex);
        Animal newAnimal = new Animal(givenId, givenName, tempOwner, givenWeight);

        animalCollection.remove(x);
        animalCollection.add(newAnimal);
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